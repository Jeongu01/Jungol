import java.util.Scanner;

public class jungol_161 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] scores = new int[11];
        int score;

        while (true) {
            score = scanner.nextInt();
            if (score == 0) break;
            scores[score/10]++;
        }

        for(int i = 10; i >= 0; i--) {
            if(scores[i] != 0)
                System.out.println(i * 10 + " : " + scores[i] + " person");
        }
    }
}
