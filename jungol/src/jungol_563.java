import java.util.Arrays;
import java.util.Scanner;

public class jungol_563 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer[] intArr = new Integer[10];

        for(int i = 0; i < 10; i++) {
            intArr[i] = scanner.nextInt();
        }

        Arrays.sort(intArr, (a, b) -> b - a);
        for(int i : intArr)
            System.out.print(i + " ");
    }
}
