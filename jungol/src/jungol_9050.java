import java.util.Scanner;

public class jungol_9050 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, sum = 0;

        a = scanner.nextInt();
        for (int i = 1; i <= a; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}
