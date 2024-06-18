import java.util.Scanner;

public class jungol_9100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;

        a = scanner.nextInt();
        b = scanner.nextInt();

        cal(a, b);
    }

    public static void cal(int a, int b) {
        System.out.println("(" + a + " + 10) * (" + b + " - 5) = " + ((a + 10) * (b - 5)));
    }
}
