import java.util.Scanner;

public class jungol_164 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int SUM = 3;
        int point;
        int[][] arr = new int[4][4];

        for(int i = 0; i < 4; i++) {
            System.out.print(i + 1 + "class? ");
            for(int j = 0; j < 3; j++) {
                point = scanner.nextInt();
                arr[i][j] = point;
                arr[i][SUM] += point;
            }
        }

        for(int i = 0; i < 4; i++) {
            System.out.println(i + 1 + "class : " + arr[i][SUM]);
        }
    }
}
