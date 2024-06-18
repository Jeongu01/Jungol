import java.util.Arrays;
import java.util.Scanner;

public class jungol_579 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] arr = new Integer[n];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        sort(arr);
    }

    public static void sort(Integer[] arr) {
        Arrays.sort(arr, (a, b) -> b - a);
        for(int i : arr) {
            System.out.print(i + " ");
        }
    }
}
