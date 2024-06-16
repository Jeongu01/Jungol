import java.util.Scanner;

public class jungol_9027 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b;
        int resultDouble, resultInt;

        a = scanner.nextDouble();
        b = scanner.nextDouble();

        resultDouble = (int) (a + b);
        resultInt = (int) a + (int) b;

        System.out.println(resultDouble + " " + resultInt);
    }
}
