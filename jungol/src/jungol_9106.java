import java.util.Scanner;

public class jungol_9106 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(fibonacci(n));
    }

    private static int fibonacci(int n) {
        if(n > 2) {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
        else return 1;
    }
}
