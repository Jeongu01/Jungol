import java.util.Scanner;

public class jungol_132 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, sum = 0;
        n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0)
                sum += i;
        }

        System.out.println(sum);
    }
}
