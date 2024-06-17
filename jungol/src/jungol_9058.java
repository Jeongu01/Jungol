import java.util.Scanner;

public class jungol_9058 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        n = scanner.nextInt();

        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = n - i - 1; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
