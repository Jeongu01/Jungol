import java.util.Scanner;

public class jungol_141 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, m = 0, i = 1;
        n = scanner.nextInt();

        while (true) {
            m = n * i++;
            if (m >= 100)
                break;
            System.out.print(m + " ");
            if (m % 10 == 0)
                break;
        }
    }
}
