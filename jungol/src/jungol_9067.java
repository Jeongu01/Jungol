import java.util.Scanner;

public class jungol_9067 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] intArr;
        intArr = new int[10];

        for(int i = 0; i < 10; i++) {
            intArr[i] = scanner.nextInt();
        }

        System.out.println(intArr[2] + " " + intArr[4] + " " + intArr[9]);
    }
}
