import java.util.Scanner;

public class jungol_127 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input, sum = 0, count = 0;

        while (true) {
            input = scanner.nextInt();
            if (input < 0 || input > 100)
                break;
            sum += input;
            count++;
        }

        System.out.println("sum : " + sum);
        System.out.println("avg : " + Math.round((double) sum / count * 10.0) / 10.0);
    }
}
