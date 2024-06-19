import java.util.Scanner;

public class jungol_9102 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printNum(n, 1);
    }

    private static void printNum(int n, int i) {
        System.out.print(i + " ");
        if (n != i)
            printNum(n, i + 1);
    }
}
