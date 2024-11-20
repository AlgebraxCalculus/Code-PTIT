import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = Integer.parseInt(sc.nextLine());
       ArrayList<Station> a = new ArrayList<>();
       for (int i = 0; i < n; i++) {
           String name = sc.nextLine();
           String bd = sc.nextLine();
           String kt = sc.nextLine();
           int amount = Integer.parseInt(sc.nextLine());
           boolean check = false;
           for (Station s : a) {
               if (s.toString().contains(name)) {
                   s.addTimeAmount(bd, kt, amount);
                   check = true; 
                   break;
               }
           }
           if (!check) {
               a.add(new Station(name, bd, kt, amount));
           }
       }
       for (Station s : a) {
           System.out.println(s);
       }
    }
}
