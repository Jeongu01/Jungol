import java.util.Scanner;

public class jungol_1329 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n % 2 == 1 && n < 100) func1329(n);
        else System.out.println("INPUT ERROR!");
    }

    private static void func1329(int n) {
        int m = n / 2 + 1;
        for (int i = 0; i < m; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 2 * i; j >= 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i < m; i++) {
            for (int j = i; j < m - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 2 * (m - i) - 1; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
