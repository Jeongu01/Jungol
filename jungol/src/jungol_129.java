import java.util.Scanner;

public class jungol_129 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base, height;
        char answer;

        while (true) {
            System.out.print("Base = ");
            base = scanner.nextInt();
            System.out.print("Height = ");
            height = scanner.nextInt();
            System.out.println("Triangle width = " + Math.round((double) base * height / 2.0 * 10.0) / 10.0);
            System.out.print("Continue? ");
            answer = scanner.next().charAt(0);
            if (answer != 'Y' && answer != 'y')
                break;
        }
    }
}
