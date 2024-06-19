import java.util.Scanner;

public class jungol_236 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        long mul = (long) a * b * c;
        System.out.println(func236(mul));
    }

    private static long func236(long mul) {
        if (mul > 0) {
            long digit = (mul % 10 != 0) ? mul % 10 : 1;
            return func236(mul / 10) * digit;
        }
        return 1;
    }
}
