import java.util.Scanner;

public class jungol_524 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        boolean c, d;

        a = scanner.nextInt();
        b = scanner.nextInt();

        c = (a != 0);
        d = (b != 0);

        System.out.println((c&d) + " " + (c|d));
    }
}
