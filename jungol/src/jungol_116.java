import java.util.Scanner;

public class jungol_116 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;

        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        System.out.println(Math.round((a + b + c) / 3.0 * 10.0) / 10.0);
    }
}
