import java.util.Scanner;

public class jungol_231 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        func231(n);
    }

    private static void func231(int n) {
        if(n >= 1) {
            func231(n/2);
            System.out.print(n + " ");
        }
    }
}
