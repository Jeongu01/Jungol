import java.util.Scanner;

public class jungol_145 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        n = scanner.nextInt();

        for(int i = 0; i < n; i++) {
            for (int j = n - 1; j > i; j--){
                System.out.print("  ");
            }
            for (int j = 1; j <= i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
