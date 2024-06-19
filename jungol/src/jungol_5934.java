import java.util.Scanner;

public class jungol_5934 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if(n%2 == 1 && n < 100) func5934(n);
        else System.out.println("INPUT ERROR!");
    }

    private static void func5934(int n) {
        int m = n / 2 + 1;
        for(int i = 0; i < m; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print(" ");
            }
            for(int j = i; j < m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i < m; i++) {
            for (int j = 0; j < m - 1; j++){
                System.out.print(" ");
            }
            for(int j = i; j >= 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
