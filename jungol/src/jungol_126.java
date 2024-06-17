import java.util.Scanner;

public class jungol_126 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input, countOdd = 0, countEven = 0;

        while (true) {
            input = scanner.nextInt();

            if (input == 0)
                break;
            else if (input % 2 == 0)
                countEven++;
            else countOdd++;
        }

        System.out.println("odd : " + countOdd);
        System.out.println("even : " + countEven);
    }
}
