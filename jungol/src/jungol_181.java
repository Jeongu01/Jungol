import java.util.Scanner;

public class jungol_181 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("radius : ");
        double radius = scanner.nextDouble();
        getArea(radius);
    }

    private static void getArea(double radius) {
        System.out.printf("area = %.3f", radius * radius * 3.141592);
    }
}
