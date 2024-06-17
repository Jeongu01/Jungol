import java.util.Scanner;

public class jungol_549 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, sum = 0, i = 1, count = 0;

        n = scanner.nextInt();

        while (sum < n) {
            sum += i;
            i = i + 2;
            count++;
        }
        System.out.println(count + " " + sum);
    }
}
