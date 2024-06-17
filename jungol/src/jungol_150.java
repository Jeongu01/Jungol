import java.util.Scanner;

public class jungol_150 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch;
        char[] charArr = new char[10];

        for(int i = 0; i < 10; i++) {
            charArr[i] = scanner.next().charAt(0);
        }

        for(int i = charArr.length - 1; i >= 0; i--) {
            System.out.print(charArr[i] + " ");
        }
    }
}
