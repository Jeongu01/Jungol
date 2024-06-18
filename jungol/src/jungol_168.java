import java.util.Scanner;

public class jungol_168 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][n + 1];
        arr[n - 1][1] = 1;

        for(int i = n - 2; i >= 0; i--) {
            for (int j = 1; j <= n; j++) {
                arr[i][j] = arr[i + 1][j] + arr[i + 1][j - 1];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n; j++) {
                if(arr[i][j] != 0)
                    System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
