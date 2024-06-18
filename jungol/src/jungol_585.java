import java.util.Scanner;

public class jungol_585 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        for(int i = 0; i < 10; i++) {
            arr[i] = scanner.nextInt();
        }
        bubble(arr);
    }
    public static void bubble(int[] arr) {
        int temp;
        for(int j = 9; j > 0; j--) {
            for (int i = 0; i < 9; i++) {
                if (arr[i] < arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            for (int i : arr){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
