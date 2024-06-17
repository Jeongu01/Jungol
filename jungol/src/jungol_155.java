import java.util.Scanner;

public class jungol_155 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] charArr = {'J', 'U', 'N', 'G', 'O', 'L'};
        char ch;
        boolean exist = false;

        ch = scanner.next().charAt(0);

        for(int i = 0; i < charArr.length; i++) {
            if(charArr[i] == ch) {
                System.out.println(i);
                exist = true;
            }
        }

        if(!exist) System.out.println("none");
    }
}
