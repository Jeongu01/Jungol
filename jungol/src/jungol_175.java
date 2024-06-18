import java.util.Arrays;
import java.util.Scanner;

public class jungol_175 {
    public static void main(String[] args) {
        printSort();
    }

    private static void printSort() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Integer[] arr = new Integer[N];

        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr, (a, b) -> b - a);

        for(int i : arr) {
            System.out.print(i + " ");
        }
    }
}
