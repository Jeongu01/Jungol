import java.util.Scanner;

public class jungol_235 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(func235(n));
    }

    private static int func235(int n) {
        if(n != 1) {
            if(n%2==0) {
                return func235(n/2) + 1;
            } else {
                return func235(n/3) + 1;
            }
        } else {
            return 0;
        }
    }
}
