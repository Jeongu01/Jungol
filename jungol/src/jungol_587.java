import java.util.Scanner;

public class jungol_587 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printRecursive(n);
    }

    private static void printRecursive(int n) {
        if (n > 0) {
            System.out.println("recursive");
            printRecursive(n - 1);
        } else return;
    }
}
