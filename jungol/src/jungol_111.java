import java.util.Scanner;

public class jungol_111 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int korean, english, math, computer, sum;

        korean = scanner.nextInt();
        english = scanner.nextInt();
        math = scanner.nextInt();
        computer = scanner.nextInt();

        sum = korean + english + math + computer;

        System.out.println("sum " + sum);
        System.out.println("avg " + sum / 4);
    }
}
