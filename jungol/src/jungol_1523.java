import java.util.Scanner;

public class jungol_1523 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, m;
        n = scanner.nextInt();
        m = scanner.nextInt();

        if (1 <= n && n <= 100) {
            switch (m) {
                case 1:
                    func1523_1(n);
                    break;
                case 2:
                    func1523_2(n);
                    break;
                case 3:
                    func1523_3(n);
                    break;
                default:
                    System.out.println("INPUT ERROR!");
            }
        } else {
            System.out.println("INPUT ERROR!");
        }
    }

    private static void func1523_1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j >= 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void func1523_2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void func1523_3(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 2 * i; j >= 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
