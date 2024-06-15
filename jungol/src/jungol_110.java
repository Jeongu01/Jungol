import java.util.Scanner;

public class jungol_110 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double input, yard = 91.44;

        System.out.print("yard? ");

        input = scanner.nextDouble();

        System.out.println(input + "yard = " + Math.round(input * yard * 10)/10.0 + "cm");
    }
}
