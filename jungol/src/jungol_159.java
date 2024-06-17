import java.util.Arrays;
import java.util.Scanner;

public class jungol_159 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        Integer[] intArr;

        n = scanner.nextInt();
        intArr = new Integer[n];

        for (int i = 0; i < n; i++) {
            intArr[i] = scanner.nextInt();
        }

        Arrays.sort(intArr, (a, b) -> b - a);
        for(int element : intArr) {
            System.out.println(element);
        }
    }
}
