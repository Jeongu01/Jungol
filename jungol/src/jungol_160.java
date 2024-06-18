import java.util.Scanner;

public class jungol_160 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dices = new int[6];
        int n;

        for(int i = 0; i < 10; i++) {
            n = scanner.nextInt();
            dices[n - 1]++;
        }

        for (int i = 0; i < dices.length; i++) {
            System.out.println(i + 1 + " : " + dices[i]);
        }
    }
}
