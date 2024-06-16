import java.util.Scanner;

public class jungol_9022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;

        a = scanner.nextInt();
        b = scanner.nextInt();

        c = ++a + b--;

        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
    }
}
