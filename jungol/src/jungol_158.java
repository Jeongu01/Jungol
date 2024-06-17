import java.util.ArrayList;
import java.util.Scanner;

public class jungol_158 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        int input;

        while (true) {
            input = scanner.nextInt();
            if (input == 0) break;
            integerArrayList.add(input);
        }

        System.out.println(integerArrayList.size());
        for (int element : integerArrayList) {
            if (element % 2 == 0)
                System.out.print(element / 2 + " ");
            else System.out.print(element * 2 + " ");
        }
    }
}
