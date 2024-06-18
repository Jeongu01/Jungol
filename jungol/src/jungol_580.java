import java.util.Scanner;

public class jungol_580 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month, day;
        month = scanner.nextInt();
        day = scanner.nextInt();

        printCheck(month, day);
    }

    public static void printCheck(int month, int day) {
        String answer;
//        int lastDay = switch (month) {
//            case 1, 3, 5, 7, 8, 10, 12 -> 31;
//            case 4, 6, 9, 11 -> 30;
//            case 2 -> 29;
//            default -> 0;
//        };
        int lastDay;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                lastDay = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                lastDay = 30;
                break;
            case 2:
                lastDay = 29;
                break;
            default:
                lastDay = 0;
                break;
        }
        answer = (lastDay >= day) ? "OK!" : "BAD!";

        System.out.println(answer);
    }
}
