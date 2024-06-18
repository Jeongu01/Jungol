import java.util.Scanner;

public class jungol_167 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[5][3];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 4; i++) {
            arr[i][2] = arr[i][0] + arr[i][1];
            System.out.print(arr[i][2] / 2 + " ");
        }
        System.out.println();
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                arr[4][i] += arr[j][i];
            }
            System.out.print(arr[4][i] / 4 + " ");
        }
        System.out.println();
        System.out.println((arr[4][0] + arr[4][1]) / 8);
    }
}
