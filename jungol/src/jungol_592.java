import java.util.Scanner;

public class jungol_592 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        System.out.println(sumDigits(n));
    }

    private static long sumDigits(long n) {
        if (n / 10 != 0) {
            return sumDigits(n / 10) + (int) Math.pow(n % 10, 2);
        } else return (int) Math.pow(n % 10, 2);
    }
}
