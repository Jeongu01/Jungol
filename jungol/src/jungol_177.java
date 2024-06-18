import java.util.Scanner;

public class jungol_177 {
    public static void main(String[] args) {
        calAbs();
    }

    private static void calAbs() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        for(int i = 0; i < 5; i++) {
            sum += Math.abs(scanner.nextInt());
        }
        System.out.println(sum);
    }
}
