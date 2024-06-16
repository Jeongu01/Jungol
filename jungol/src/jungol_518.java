import java.util.Scanner;

public class jungol_518 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input1, input2, input3, sum;

        input1 = scanner.nextInt();
        input2 = scanner.nextInt();
        input3 = scanner.nextInt();
        sum = input1 + input2 + input3;

        System.out.println("sum : " + sum);
        System.out.println("avg : " + sum/3);
    }
}
