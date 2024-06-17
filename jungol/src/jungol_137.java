import java.util.Scanner;

public class jungol_137 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;

        a = scanner.nextInt();
        b = scanner.nextInt();

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}
