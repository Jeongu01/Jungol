import java.util.Scanner;

public class jungol_157 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, count = 0, input;

        while (true) {
            input = scanner.nextInt();
            if (input == 0) break;
            if (input % 5 == 0) {
                sum += input;
                count++;
            }
        }

        System.out.println("Multiples of 5 : " + count);
        System.out.println("sum : " + sum);
        System.out.println("avg : " + Math.round((double) sum / count * 10.0) / 10.0);
    }
}
