import java.util.Scanner;

public class jungol_537 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, i = 1, sum = 0;

        a = scanner.nextInt();

        while (i <= a) {
            sum += i++;
        }

        System.out.println(sum);
    }
}
