import java.util.Scanner;

public class jungol_176 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b;
        a = scanner.nextDouble();
        b = scanner.nextDouble();

        printCount(a, b);
    }

    private static void printCount(double a, double b) {
        double start = Math.min(a, b);
        double end = Math.max(a, b);

        System.out.println((int) Math.floor(Math.pow(end, 0.5)) - (int) Math.ceil(Math.pow(start, 0.5)) + 1);

    }
}
