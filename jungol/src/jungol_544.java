import java.util.Scanner;

public class jungol_544 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, sum = 0;

        a = scanner.nextInt();

        for(int i = a; i <= 100; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}
