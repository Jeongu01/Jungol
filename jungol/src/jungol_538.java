import java.util.Scanner;

public class jungol_538 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = 1;

        while (input != 0) {
            System.out.print("number? ");
            input = scanner.nextInt();
            if (input > 0)
                System.out.println("positive integer");
            else if (input < 0)
                System.out.println("negative number");
        }
    }
}
