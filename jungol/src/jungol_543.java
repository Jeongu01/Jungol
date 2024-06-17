import java.util.Scanner;

public class jungol_543 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;

        a = scanner.nextInt();

        for (int i = 2; i <= a; i = i + 2) {
            System.out.print(i + " ");
        }
    }
}
