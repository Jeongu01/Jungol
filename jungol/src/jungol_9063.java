import java.util.Scanner;

public class jungol_9063 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr;
        arr = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = scanner.nextInt();
        }

        for(int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
