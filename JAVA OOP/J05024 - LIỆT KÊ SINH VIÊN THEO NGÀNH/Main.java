import java.util.Scanner;

public class Main {
    private static String solve (String s) {
        if (s.equals("Ke toan")) {
            return "KT";
        } else if (s.equals("Cong nghe thong tin")) {
            return "CN";
        } else if (s.equals("Vien thong")) {
            return "VT";
        } else if (s.equals("An toan thong tin")) {
            return "AT";
        }
        return "DT";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Student[] a = new Student[n];
        for (int i = 0; i < n; i++) {
            a[i] = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        int q = Integer.parseInt(sc.nextLine());
        while (q --> 0) {
            String major = sc.nextLine();
            String res = solve(major);
            System.out.println("DANH SACH SINH VIEN NGANH " + major.toUpperCase() + ":");
            for (Student x : a) {
                if (res.equals("CN") || res.equals("AT")) {
                    if (x.getMa().substring(5, 7).equals(res) && !String.valueOf(x.getLop().charAt(0)).equals("E")) {
                        System.out.println(x);
                    } 
                } else {
                    if (x.getMa().substring(5, 7).equals(res)) {
                        System.out.println(x);
                    }
                }
            }
        }
    }
}
