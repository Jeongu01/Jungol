import java.util.Scanner;

public class jungol_9068 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;
        int[] intArr;
        intArr = new int[100];

        for(int i = 0; i < 100; i++) {
            input = scanner.nextInt();
            if(input == 0)
                break;
            intArr[i] = input;
        }

        for (int i = 1; i < intArr.length && intArr[i] != 0; i += 2) {
            System.out.print(intArr[i] + " ");
        }
    }
}
