import java.util.Scanner;

public class jungol_633 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;

        while (true) {
            System.out.print("1. Korea\n" +
                    "2. USA\n" +
                    "3. Japan\n" +
                    "4. China\n" +
                    "number? ");
            a = scanner.nextInt();

            System.out.println();
            if (a == 1)
                System.out.println("Seoul");
            else if (a == 2)
                System.out.println("Washington");
            else if (a == 3)
                System.out.println("Tokyo");
            else if (a == 4)
                System.out.println("Beijing");
            else {
                System.out.println("none");
                break;
            }
            System.out.println();

        }


    }
}
