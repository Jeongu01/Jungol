import java.util.Scanner;

public class jungol_156 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 1000, max = -1000, a;

        while (true) {
            a = scanner.nextInt();
            if(a == 999) break;
            min = Math.min(min, a);
            max = Math.max(max, a);
        }

        System.out.println("max : " + max);
        System.out.println("min : " + min);
    }
}
