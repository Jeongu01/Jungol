import java.util.Scanner;

public class jungol_9024 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c, result1, result2, result3, result4;

        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        result1 = a > b ? 1 : 0;
        result2 = b >= c ? 1 : 0;
        result3 = a <= b ? 1 : 0;
        result4 = b < c ? 1 : 0;

        System.out.println(result1 + " " + result2 + " " + result3 + " " + result4);
    }
}
