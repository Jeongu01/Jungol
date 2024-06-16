import java.util.Scanner;

public class jungol_519 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input1, input2, result1, result2;

        input1 = scanner.nextInt();
        input2 = scanner.nextInt();

        result1 = input1 + 100;
        result2 = input2 % 10;

        System.out.println(result1 + " " + result2);
    }
}
