import java.util.Arrays;
import java.util.Scanner;

public class jungol_590 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        Arrays.fill(arr, 1);
        printDicesIn590(arr, 0);
    }

    private static void printDicesIn590(int[] arr, int k) {
        if(k != arr.length) {
            for (int i = 1; i <= 6; i++) {
                arr[k] = i;
                printDicesIn590(arr, k + 1);
            }
        } else {
            boolean isSorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if(arr[i] > arr[i + 1]) isSorted = false;
            }
            if (isSorted) {
                for (int i : arr) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
        }
    }
}
