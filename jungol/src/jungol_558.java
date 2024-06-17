import java.util.Scanner;

public class jungol_558 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input, i;
        int[] intArr;
        intArr = new int[100];

        for(i = 0; i < 100; i++) {
            input = scanner.nextInt();
            if(input == 0)
                break;
            intArr[i] = input;
        }

        for(int j = i - 1; j >= 0; j--) {
            System.out.print(intArr[j] + " ");
        }
    }
}
