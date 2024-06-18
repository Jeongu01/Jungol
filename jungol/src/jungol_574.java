import java.util.Scanner;

public class jungol_574 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c, max;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        max = findMax(a, b, c);
        System.out.println(max);
    }

    public static int findMax(int a, int b, int c) {
        int max = Math.max(a, b);
        max = Math.max(max, c);

        return max;
    }
}
