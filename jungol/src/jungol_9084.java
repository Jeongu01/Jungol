import java.util.Scanner;

public class jungol_9084 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printStar(n);
    }

    public static void printStar(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j >= 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
