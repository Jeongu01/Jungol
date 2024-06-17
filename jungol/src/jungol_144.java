import java.util.Scanner;

public class jungol_144 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2 * (n - i) - 2; j++) {
                System.out.print(" ");
            }
            for (int j = 2 * i + 1; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
