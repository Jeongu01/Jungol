import java.util.Scanner;

public class jungol_566 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] intArr = new int[2];
        int n, temp;
        n = scanner.nextInt();
        intArr[0] = 100;
        intArr[1] = n;
        System.out.print(intArr[0] + " " + intArr[1] + " ");

        while (intArr[1] >= 0) {
            temp = intArr[0] - intArr[1];
            intArr[0] = intArr[1];
            intArr[1] = temp;
            System.out.print(intArr[1] + " ");
        }
    }
}
