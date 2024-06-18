import java.util.Scanner;

public class jungol_179 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c;
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();

        rounds(a, b, c);
    }

    private static void rounds(double a, double b, double c) {
        System.out.println(Math.round((a + b + c) / 3));
        System.out.println(Math.round((Math.round(a) + Math.round(b) + Math.round(c)) / 3.0));
    }
}
