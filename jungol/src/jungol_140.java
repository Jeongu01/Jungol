import java.util.Scanner;

public class jungol_140 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, input, count = 0;

        for (int i = 0; i < 20; i++) {
            input = scanner.nextInt();
            if (input == 0)
                break;
            sum += input;
            count++;
        }

        System.out.println(sum + " " + sum / count);
    }
}
