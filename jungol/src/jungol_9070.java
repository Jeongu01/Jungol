import java.util.Arrays;
import java.util.Scanner;

public class jungol_9070 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        int[] intArr;
        intArr = new int[10];

        for(int i = 0; i < 10; i++) {
            intArr[i] = scanner.nextInt();
            max = Math.max(max, intArr[i]);
        }

        System.out.println(max);
    }
}
