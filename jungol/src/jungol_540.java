import java.util.Scanner;

public class jungol_540 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = 0;

        while (input != -1) {
            input = scanner.nextInt();
            if (input % 3 == 0)
                System.out.println(input / 3);
        }
    }
}
