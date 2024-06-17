import java.util.Scanner;

public class jungol_151 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] intArr = new int[5];

        for(int i = 0; i < intArr.length; i++) {
            intArr[i] = scanner.nextInt();
        }

        System.out.println(intArr[0] + intArr[2] + intArr[4]);
    }
}
