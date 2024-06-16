import java.util.Scanner;

public class jungol_113 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width, length;

        width = scanner.nextInt();
        length = scanner.nextInt();
        width += 5;
        length *= 2;

        System.out.println("width = " + width);
        System.out.println("length = " + length);
        System.out.println("area = " + width * length);
    }
}
