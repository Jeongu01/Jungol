import java.util.Scanner;

public class jungol_147 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, count = 1;
        n = scanner.nextInt();

        for(int i = 0; i < n; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print("  ");
            }
            for (int j = i; j < n; j++) {
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }
}
