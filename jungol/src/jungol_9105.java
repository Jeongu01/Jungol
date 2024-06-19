import java.util.Arrays;
import java.util.Scanner;

public class jungol_9105 {
    private static int n;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int[] arr = new int[n];
        Arrays.fill(arr, 1);
        printDices(arr, 0);
    }

    private static void printDices(int[] arr, int k) {

        if (k != n) {
            for (int i = 1; i <= 6; i++) {
                arr[k] = i;
                printDices(arr, k + 1);
            }
        } else {
            for (int j : arr) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

