import java.util.Scanner;

public class jungol_9107 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 1;
        fibonacci(arr);
        System.out.println(arr[n - 1]);
    }

    private static void fibonacci(int[] arr) {
        for(int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
    }
}
