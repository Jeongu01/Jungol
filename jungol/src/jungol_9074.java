import java.util.Scanner;

public class jungol_9074 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] intArr = new int[10 + 1];
        int input;

        while (true){
            input = scanner.nextInt();
            if(input < 1 || input > 10) break;
            intArr[input]++;
        }

        for(int index = 0; index < intArr.length; index++) {
            if(intArr[index] > 0)
                System.out.println(index + " : " + intArr[index] + "개");
        }
    }
}
