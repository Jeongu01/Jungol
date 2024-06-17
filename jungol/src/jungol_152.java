import java.util.Scanner;

public class jungol_152 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumEven = 0, sumOdd = 0;

        for(int i = 1; i <= 10; i++) {
            if(i%2 == 0)
                sumEven += scanner.nextInt();
            else sumOdd += scanner.nextInt();
        }

        System.out.println("odd : " + sumOdd);
        System.out.println("even : " + sumEven);
    }
}
