import java.util.Scanner;

public class jungol_569 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] scores = new int[5][4];
        int count = 0;

        for(int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                scores[i][j] = scanner.nextInt();
            }
        }

        for(int i = 0; i < 5; i++) {
            int sum = 0;
            for (int j = 0; j < 4; j++) {
                sum += scores[i][j];
            }
            if(sum/4.0 >= 80){
                System.out.println("pass");
                count++;
            } else {
                System.out.println("fail");
            }
        }

        System.out.println("Successful : " + count);
    }
}
