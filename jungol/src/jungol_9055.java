import java.util.Scanner;

public class jungol_9055 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, sum = 0, i = 1;

        n = scanner.nextInt();

        while (sum < n) {
            sum += i++;
        }

        System.out.println(--i + " " + sum);
    }
}
