import java.util.Scanner;

public class jungol_123 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;

        System.out.print("Number? ");
        a = scanner.nextInt();

        if (a == 1)
            System.out.println("dog");
        else if (a == 2)
            System.out.println("cat");
        else if (a == 3)
            System.out.println("chick");
        else System.out.println("I don't know.");
    }
}
