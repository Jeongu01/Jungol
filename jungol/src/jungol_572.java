import java.util.Scanner;

public class jungol_572 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r = scanner.nextDouble();
        calArea(r);
    }

    public static void calArea(double r) {
        double area = r * r * 3.14;
        System.out.printf("%.2f", area);;
    }
}
