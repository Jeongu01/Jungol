import java.util.Scanner;

public class jungol_128 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input, count = 0;

        while (true) {
            input = scanner.nextInt();
            if (input == 0)
                break;
            if (input % 3 != 0 && input % 5 != 0)
                count++;
        }
        System.out.println(count);
    }
}
