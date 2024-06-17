import java.util.Scanner;

public class jungol_9071 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input, maxOfEvens = -10000, minOfOdds = 10000;

        for(int i = 0; i < 10; i++) {
            input = scanner.nextInt();
            if(input%2 == 0)
                maxOfEvens = Math.max(maxOfEvens, input);
            else
                minOfOdds = Math.min(minOfOdds, input);
        }

        System.out.println(minOfOdds + " " + maxOfEvens);
    }
}
