import java.util.Scanner;

public class jungol_565 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] intArr = new int[10];
        int input;

        while (true) {
            input = scanner.nextInt();
            if(input == 0) break;
            intArr[input/10]++;
        }

        for(int i = 0; i < intArr.length; i++) {
            if(intArr[i] != 0) {
                System.out.println(i + " : " + intArr[i]);
            }
        }
    }
}
