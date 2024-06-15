import java.util.Scanner;

public class jungol_517 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double input1, input2, input3;

        input1 = scanner.nextDouble();
        input2 = scanner.nextDouble();
        input3 = scanner.nextDouble();

        System.out.println(Math.round(input1*1000)/1000.0);
        System.out.println(Math.round(input2*1000)/1000.0);
        System.out.println(Math.round(input3*1000)/1000.0);
    }
}
