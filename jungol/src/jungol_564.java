import java.util.Scanner;

public class jungol_564 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] intArr = new int[26];
        char ch;

        while (true) {
            ch = scanner.next().charAt(0);
            if(!Character.isUpperCase(ch)) break;
            intArr[ch - 'A']++;
        }

        for(ch = 'A'; ch <= 'Z'; ch++) {
            if(intArr[ch - 'A'] > 0)
                System.out.println(ch + " : " + intArr[ch - 'A']);
        }
    }
}
