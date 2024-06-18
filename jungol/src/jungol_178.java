import java.util.Scanner;

public class jungol_178 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        pow(n);
    }

    private static void pow(int n) {
        System.out.println((int) Math.pow(2, n));
    }


}
