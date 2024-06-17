import java.util.Scanner;

public class jungol_133 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, input, sum = 0;

        n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            input = scanner.nextInt();
            sum += input;
        }

        System.out.println(Math.round((double) sum / n * 100.0) / 100.0);
    }
}
