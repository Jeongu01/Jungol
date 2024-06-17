import java.util.Scanner;

public class jungol_136 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        n = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.print(n * i + " ");
        }
    }
}
