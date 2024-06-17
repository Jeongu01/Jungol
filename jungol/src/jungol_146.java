import java.util.Scanner;

public class jungol_146 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, count = 0;
        char ch = 'A';

        n = scanner.nextInt();

        for(int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(ch++ + " ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }
}
