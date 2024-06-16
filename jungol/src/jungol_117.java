import java.util.Scanner;

public class jungol_117 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c;

        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();

        System.out.println("sum " + ((int) a + (int) b + (int) c));
        System.out.println("avg " + (int) ((a + b + c) / 3.0));
    }
}
