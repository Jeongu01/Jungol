import java.util.Scanner;

public class jungol_166 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] firstArr = new int[2][3];
        int[][] secondArr = new int[2][3];

        System.out.println("first array");
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 3; j++) {
                firstArr[i][j] = scanner.nextInt();
            }
        }

        System.out.println("second array");
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 3; j++) {
                secondArr[i][j] = scanner.nextInt();
            }
        }

        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(firstArr[i][j] * secondArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
