import java.util.Scanner;

public class jungol_142 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = i; j >= 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i; j < n - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
