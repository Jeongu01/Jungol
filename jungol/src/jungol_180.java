import java.util.Scanner;

public class jungol_180 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[7];
        for(int i = 0; i < 7; i++) {
            arr[i] = scanner.nextInt();
        }
        bubbleStep(arr);
        bubbleStep(arr);
        bubbleStep(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private static void bubbleStep(int[] arr) {
        for(int i = 0; i < 6; i++) {
            if(arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
    }
}
