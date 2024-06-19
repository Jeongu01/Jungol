import java.util.Scanner;

public class jungol_233 {
    private static int n, m;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        m = scanner.nextInt();
        int[] arr = new int[n];

        func233(arr, 0);
    }

    private static void func233(int[] arr, int k) {
        if (n > k) {
            for (int i = 1; i <= 6; i++) {
                arr[k] = i;
                func233(arr, k + 1);
            }
        } else {
            int sum = 0;
            for (int i : arr) {
                sum += i;
            }
            if (sum == m) {
                for (int i : arr) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
        }
    }
}
