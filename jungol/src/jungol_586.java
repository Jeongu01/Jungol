import java.util.Scanner;

public class jungol_586 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        a = scanner.nextInt();
        b = scanner.nextInt();

        cal(a, b);
    }

    private static void cal(int a, int b) {
        System.out.println("(" + a + " - " + b + ") ^ 2 = " + (long) Math.pow((a - b), 2));
        System.out.println("(" + a + " + " + b + ") ^ 3 = " + (long) Math.pow((a + b), 3));
    }

}
