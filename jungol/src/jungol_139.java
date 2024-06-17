import java.util.Scanner;

public class jungol_139 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;

        a = scanner.nextInt();
        b = scanner.nextInt();

        if (a > b) {
            for (int i = 1; i < 10; i++) {
                for (int j = a; j >= b; j--) {
                    System.out.printf("%d * %d = %2d   ", j, i, i * j);
                }
                System.out.println();
            }
        }
        else {
            for (int i = 1; i < 10; i++) {
                for (int j = a; j <= b; j++) {
                    System.out.printf("%d * %d = %2d   ", j, i, i * j);
                }
                System.out.println();
            }
        }
    }
}
