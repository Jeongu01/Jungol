import java.util.Scanner;

public class jungol_557 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] charArr;
        charArr = new char[10];

        for(int i = 0; i < 10; i++) {
            charArr[i] = scanner.next().charAt(0);
        }

        System.out.println(charArr[0] + " " + charArr[3] + " " + charArr[6]);
    }
}
