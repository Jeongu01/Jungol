import java.util.Scanner;

public class jungol_162 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        arr[0] = scanner.nextInt();
        arr[1] = scanner.nextInt();

        System.out.print(arr[0] + " " + arr[1] + " ");

        for (int i = 2; i < 10; i++) {
            arr[i] = (arr[i - 1] + arr[i - 2]) % 10;
            System.out.print(arr[i] + " ");
        }
    }
}
