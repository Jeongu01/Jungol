import java.util.Scanner;

public class jungol_9104 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long result = sumDigits(n);
        System.out.println(result);
    }

    private static long sumDigits(long n) {
        if (n / 10 != 0) {
            return sumDigits(n / 10) + n % 10;
        } else return n % 10;
    }
}
