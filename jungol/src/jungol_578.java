import java.util.Scanner;

public class jungol_578 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        a = scanner.nextInt();
        b = scanner.nextInt();

        printMul(a, b);
    }

    public static void printMul(int a, int b) {
        int start = Math.min(a, b);
        int end = Math.max(a, b);

        for (int i = start; i <= end; i++) {
            System.out.println("== " + i + "dan ==");
            for (int j = 1; j < 10; j++) {
                System.out.printf("%d * %d = %2d\n", i, j, i * j);
            }
            System.out.println();
        }
    }
}
