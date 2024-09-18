import java.util.Scanner;

public class Matrix {
    private int n, m;
    private int[][] a;
    public Matrix (int n, int m) {
        this.n = n;
        this.m = m;
        this.a = new int[n][m];
    }
    public void nextMatrix (Scanner sc) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
    }
    public Matrix mul (Matrix other) {
        Matrix c = new Matrix(n, other.m);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < other.m; j++) {
                int res = 0;
                for (int k = 0; k < m; k++) {
                    res += this.a[i][k] * other.a[k][j];
                }
                c.a[i][j] = res;
            }
        }
        return c;
    }
    @Override
    public String toString () {
        String res = "";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                res += Integer.toString(a[i][j]) + " ";
            }
            res += "\n";
        }
        return res;
    }
}
