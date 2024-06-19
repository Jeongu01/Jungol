import java.util.Scanner;

public class jungol_588 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        printNums(n);
    }

    private static void printNums(int n) {
        if(n > 0) {
            System.out.print(n + " ");
            printNums(n - 1);
        }
    }
}
