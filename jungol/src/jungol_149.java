import java.util.Scanner;

public class jungol_149 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, count = 1;
        n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(count % 10 + " ");
                count++;
                count++;
            }
            System.out.println();
        }
    }
}
