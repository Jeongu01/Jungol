import java.util.Scanner;

public class jungol_131 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, start, end;

        a = scanner.nextInt();
        b = scanner.nextInt();

        start = Math.min(a, b);
        end = Math.max(a, b);

        for(int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
    }
}
