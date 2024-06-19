import java.util.Scanner;

public class jungol_234 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        func234(arr, n - 1);
        System.out.println(arr[n - 1]);
    }

    private static void func234(int[] arr, int k) {
        if (k >= 2) {
            func234(arr, k - 1);
            arr[k] = (arr[k - 1] * arr[k - 2]) % 100;
        } else {
            arr[0] = 1;
            arr[1] = 2;
        }
    }

    private static int func234Recursive(int n) {
        if (n > 2) {
            return (func234Recursive(n - 1) * func234Recursive(n - 2)) % 100;
        } else {
            return n;
        }
    }
}
