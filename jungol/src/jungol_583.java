import java.util.Arrays;
import java.util.Scanner;

public class jungol_583 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c;
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();

        cal(a, b, c);
    }

    public static void cal(double a, double b, double c) {
        double max, mid, min;
        double[] arr = {a, b, c};
        Arrays.sort(arr);

        min = arr[0];
        mid = arr[1];
        max = arr[2];

        System.out.println((int) Math.ceil(max) + " " + (int) Math.floor(min) + " " + Math.round(mid));
    }
}
