import java.util.Scanner;

public class jungol_559 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        Double[] doubleArr;
        doubleArr = new Double[6];

        doubleArr[0] = 85.6;
        doubleArr[1] = 79.5;
        doubleArr[2] = 83.1;
        doubleArr[3] = 80.0;
        doubleArr[4] = 78.2;
        doubleArr[5] = 75.0;

        a = scanner.nextInt();
        b = scanner.nextInt();

        System.out.println(Math.round((doubleArr[a - 1] + doubleArr[b - 1]) * 10.0) / 10.0);
    }
}
