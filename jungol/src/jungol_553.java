import java.util.Scanner;

public class jungol_553 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        char alpha = 'A';
        n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for(int j = i; j < n; j++) {
                System.out.print(alpha++);
            }
            System.out.println();
        }
    }
}
