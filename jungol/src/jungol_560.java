import java.util.Scanner;

public class jungol_560 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input, min = 10000;

        for(int i = 0; i < 10; i++) {
            input = scanner.nextInt();
            min = Math.min(min, input);
        }

        System.out.println(min);
    }
}
