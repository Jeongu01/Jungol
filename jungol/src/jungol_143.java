import java.util.Scanner;

public class jungol_143 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        n = scanner.nextInt();

        for(int i = 0; i < n; i++) {
            for(int j = i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * (n-i) -1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 2 * i + 1; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
