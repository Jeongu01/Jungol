import java.util.Scanner;

public class jungol_581 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        double c, d;

        a = scanner.nextInt();
        b = scanner.nextInt();

        bigAbs(a, b);

        c = scanner.nextDouble();
        d = scanner.nextDouble();

        smallAbs(c, d);
    }

    public static void bigAbs(int x, int y) {
        if (Math.abs(x) > Math.abs(y))
            System.out.println(x);
        else System.out.println(y);
    }

    public static void smallAbs(double x, double y) {
        if (Math.abs(x) < Math.abs(y))
            System.out.printf("%.2f\n", x);
        else System.out.printf("%.2f\n", y);
    }
}
