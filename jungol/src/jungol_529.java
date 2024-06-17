import java.util.Scanner;

public class jungol_529 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height, weight, bmi;

        height = scanner.nextInt();
        weight = scanner.nextInt();
        bmi = weight + 100 - height;

        System.out.println(bmi);
        if(bmi > 0)
            System.out.println("Obesity");
    }
}
