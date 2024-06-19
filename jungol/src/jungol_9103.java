import java.util.Scanner;

public class jungol_9103 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = factorial(n);
        System.out.println(result);
    }

    private static int factorial(int n) {
        if(n != 1)
            return factorial(n - 1) * n;
        else return 1;
    }
}
