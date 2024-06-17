import java.util.Scanner;

public class jungol_546 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, num, sum = 0;
        double avg;

        n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            num = scanner.nextInt();
            sum += num;
        }
        avg = (double) sum / n;

        System.out.println("avg : " + Math.round(avg * 10.0) / 10.0);
        if (avg >= 80.0)
            System.out.println("pass");
        else System.out.println("fail");
    }
}
