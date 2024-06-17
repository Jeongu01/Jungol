import java.util.Scanner;

public class jungol_135 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, min, max, sum = 0, count = 0;

        a = scanner.nextInt();
        b = scanner.nextInt();

        min = Math.min(a, b);
        max = Math.max(a, b);

        for (int i = min; i <= max; i++) {
            if(i%3 == 0 || i%5==0) {
                sum += i;
                count++;
            }
        }

        System.out.println("sum : " + sum);
        System.out.println("avg : " + Math.round((double) sum / count * 10.0) / 10.0);
    }
}
