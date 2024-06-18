import java.util.Scanner;

public class jungol_582 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double area = scanner.nextDouble();

        printRadius(area);
    }

    public static void printRadius(double area) {
        double r = Math.pow(area / 3.14, 0.5);
        System.out.printf("%.2f", r);
    }
}
