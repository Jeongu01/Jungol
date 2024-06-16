import java.util.Scanner;

public class jungol_521 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;

        a = scanner.nextInt();
        b = scanner.nextInt();
        c = a++ * --b;

        System.out.println(a + " " + b + " " + c);
    }
}
