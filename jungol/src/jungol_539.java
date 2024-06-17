import java.util.Scanner;

public class jungol_539 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = 0, sum = 0, count = 0;

        while (input < 100) {
            input = scanner.nextInt();
            sum += input;
            count++;
        }

        System.out.println(sum);
        System.out.println(Math.round((double) sum / count * 10.0) / 10.0);
    }
}
