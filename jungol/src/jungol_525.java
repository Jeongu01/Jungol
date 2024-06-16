import java.util.Scanner;

public class jungol_525 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        boolean result1, result2;

        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        result1 = (a > b) && (a > c);
        result2 = (a == b) && (b == c);

        System.out.println(result1 + " " + result2);
    }
}
