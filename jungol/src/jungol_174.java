import java.util.Scanner;

public class jungol_174 {
    public static void main(String[] args) {
        int[][] arr = new int[4][4];

        scanArr(arr);
        calArr(arr);
        printArr(arr);
    }

    public static void scanArr(int[][] arr) {
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
    }

    public static void calArr(int[][] arr) {
        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][3] += arr[i][j];
            }
        }
        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[3][i] += arr[j][i];
            }
        }
        for(int i = 0; i < 3; i++) {
            arr[3][3] += arr[3][i];
        }
    }

    public static void printArr(int[][] arr) {
        for(int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
