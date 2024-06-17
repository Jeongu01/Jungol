import java.util.Scanner;

public class jungol_545 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input, count3 = 0, count5 = 0;

        for (int i = 0; i < 10; i++) {
            input = scanner.nextInt();
            if(input%3 == 0)
                count3++;
            if (input%5==0)
                count5++;
        }

        System.out.println("Multiples of 3 : " + count3);
        System.out.println("Multiples of 5 : " + count5);
    }
}
