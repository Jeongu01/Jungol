import java.util.Arrays;
import java.util.Scanner;

public class jungol_9092 {
    public static void main(String[] args) {

        int[] arr = new int[6];
        sort(arr);
    }

    public static void sort(int[] arr) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0; i < 6; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
