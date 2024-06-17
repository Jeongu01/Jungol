import java.util.Scanner;

public class jungol_134 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input, countOdd = 0, countEven = 0;

        for (int i = 0; i < 10; i++) {
            input = scanner.nextInt();
            if (input%2 == 0)
                countEven++;
            else countOdd++;
        }

        System.out.println("even : " + countEven);
        System.out.println("odd : " + countOdd);
    }
}
