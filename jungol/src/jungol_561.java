import java.util.Scanner;

public class jungol_561 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input, minOver100 = 10000, maxUnder100 = 1;

        for(int i = 0; i < 10; i++) {
            input = scanner.nextInt();
            if(input >= 100)
                minOver100 = Math.min(minOver100, input);
            else
                maxUnder100 = Math.max(maxUnder100, input);
        }

        if(minOver100 == 10000) minOver100 = 100;
        if(maxUnder100 == 1) maxUnder100 = 100;

        System.out.println(maxUnder100 + " " + minOver100);
    }
}
