import java.util.Scanner;

public class jungol_575 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println(pow(a, b));
    }

    public static long pow(int a, int b) {
        return (long) Math.pow(a, b);
    }
}
