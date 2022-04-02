import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = scan.next();
            int x = scan.nextInt();
            System.out.format("%-15s%03d%n", s1, x);
        }
        scan.close();
        System.out.println("================================");
    }
}
//10. satırdaki tırnak içindeki kodlar, girdilerimizi formatlamamızı sağlayan özel kdolar.
//-15s (soldan 15 alanlık bir dize.) %03d tam sayı oluşturan ve 3 0 ile dolduran kod.
