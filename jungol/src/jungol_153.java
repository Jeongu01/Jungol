import java.util.ArrayList;
import java.util.Scanner;

public class jungol_153 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> intList = new ArrayList<>();
        int input;

        while (true) {
            input = scanner.nextInt();
            if (input == -1) break;
            intList.add(input);
        }

        if (intList.size() < 3)
            for (int i : intList) {
                System.out.print(i + " ");
            }
        else
            System.out.println(intList.get(intList.size() - 3) + " " + intList.get(intList.size() - 2) + " " + intList.get(intList.size() - 1));
    }
}
