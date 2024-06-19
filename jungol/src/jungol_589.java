import java.util.Scanner;

public class jungol_589 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = sigma(n);
        System.out.println(result);
    }

    private static int sigma(int n) {
        if(n > 0)
            return sigma(n - 1) + n;
        return 0;
    }
}
