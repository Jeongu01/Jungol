import java.util.Scanner;

public class jungol_9061 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, count = 0;
        n = scanner.nextInt();

        for(int i = 0; i < n; i++) {
            for (int j = i; j >= 0; j--){
                System.out.print(++count + " ");
            }
            System.out.println();
        }
    }
}
