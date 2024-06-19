import java.util.Scanner;

public class jungol_232 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        fun232(n);
    }

    private static void fun232(int n) {
        if(n > 0) {
            fun232(n - 2);
            System.out.print(n + " ");
        }
    }
}
