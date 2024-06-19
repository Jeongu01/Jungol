import java.util.Scanner;

public class jungol_591 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(fun591(n));
    }

    private static int fun591(int n) {
        if(n > 1) {
            return fun591(n / 2) + fun591(n - 1);
        } else return 1;
    }


}
