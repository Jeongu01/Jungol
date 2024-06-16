import java.util.Scanner;

public class jungol_527 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;

        a = scanner.nextInt();
        b = scanner.nextInt();

        System.out.println(a / b + " " + Math.round((double) a / b * 100.0) / 100.0);
    }
}
