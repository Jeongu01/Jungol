import java.util.Scanner;

public class jungol_562 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input, sumOdd = 0, sumEven = 0;

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0)
                sumEven += scanner.nextInt();
            else
                sumOdd += scanner.nextInt();
        }

        System.out.println("sum : " + sumEven);
        System.out.println("avg : " + Math.round(sumOdd / 5.0 * 10.0) / 10.0);
    }
}
