import java.util.Scanner;

public class jungol_115 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minsuHeight, minsuWeight, kiyeongHeight, kiyeongWeight;
        boolean result;

        minsuHeight = scanner.nextInt();
        minsuWeight = scanner.nextInt();
        kiyeongHeight = scanner.nextInt();
        kiyeongWeight = scanner.nextInt();

        result = (minsuWeight > kiyeongWeight) && (minsuHeight > kiyeongHeight);
        System.out.println(result);
    }
}
