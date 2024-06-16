import java.util.Scanner;

public class jungol_523 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;

        a = scanner.nextInt();
        b = scanner.nextInt();

        System.out.println(a + " > " + b + " ---" + (a > b));
        System.out.println(a + " < " + b + " ---" + (a < b));
        System.out.println(a + " >= " + b + " ---" + (a >= b));
        System.out.println(a + " <= " + b + " ---" + (a <= b));
    }
}
