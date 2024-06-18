import java.util.Scanner;

public class jungol_573 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printMat(n);
    }

    public static void printMat(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i * n + j + " ");
            }
            System.out.println();
        }
    }
}
