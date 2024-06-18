import java.util.Scanner;

public class jungol_9097 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r = scanner.nextDouble();
        round(r);
    }

    public static void round(double r) {
        System.out.printf("%.2f", 2 * 3.14 * r);
    }
}
