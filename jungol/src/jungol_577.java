import java.util.Scanner;

public class jungol_577 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[2];
        arr[0] = scanner.nextInt();
        arr[1] = scanner.nextInt();

        cal(arr);
        System.out.println(arr[0] + " " + arr[1]);
    }

    public static void cal(int[] arr) {
        if (arr[0] > arr[1]) {
            arr[0] = arr[0] / 2;
            arr[1] = arr[1] * 2;
        } else {
            arr[0] = arr[0] * 2;
            arr[1] = arr[1] / 2;
        }
    }
}
