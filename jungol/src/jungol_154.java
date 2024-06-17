import java.util.Scanner;

public class jungol_154 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] weightArr = new double[6];
        double sum = 0;

        for (int i = 0; i < 6; i++) {
            weightArr[i] = scanner.nextDouble();
        }

        for (double element : weightArr) {
            sum += element;
        }

        System.out.println(Math.round(sum / 6 * 10.0) / 10.0);
    }
}
