import java.util.Arrays;
import java.util.Scanner;

public class jungol_9099 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];

        for(int i = 0; i < 5; i++) {
            arr[i] = scanner.nextInt();
        }

        sort(arr);
    }

    public static void sort(int[] arr) {
        Arrays.sort(arr);
        for(int i : arr) {
            System.out.print(i + " ");
        }
    }
}
