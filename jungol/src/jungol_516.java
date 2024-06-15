import java.util.Scanner;

public class jungol_516 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double inputDouble1, inputDouble2;
        char inputChar;

        inputDouble1 = scanner.nextDouble();
        inputDouble2 = scanner.nextDouble();
        inputChar = scanner.next().charAt(0);

        System.out.println(String.format("%.2f", inputDouble1));
        System.out.println(String.format("%.2f", inputDouble2));
        System.out.println(inputChar);
    }
}
