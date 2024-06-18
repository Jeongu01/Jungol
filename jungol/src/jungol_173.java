import java.util.Scanner;

public class jungol_173 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        long result;
        a = scanner.nextInt();
        b = scanner.nextInt();
        result = calPow(a, b);
        System.out.println(result);
    }

    public static long calPow(int a, int b) {
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        long answer = (long) Math.pow(max, 2) - (long) Math.pow(min, 2);

        return answer;
    }
}
