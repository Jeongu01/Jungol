import java.util.Scanner;

public class jungol_554 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, count = 1;
        char ch = 'A';
        n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(count++ + " ");
            }
            for (int j = i; j >= 0; j--) {
                System.out.print(ch++ + " ");
            }
            System.out.println();
        }
    }
}
