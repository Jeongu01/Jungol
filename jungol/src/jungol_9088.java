import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class jungol_9088 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int operand1, operand2, result;
        char operator;

        operand1 = Integer.parseInt(stringTokenizer.nextToken());
        operator = stringTokenizer.nextToken().charAt(0);
        operand2 = Integer.parseInt(stringTokenizer.nextToken());

        result = cal(operand1, operator, operand2);
        System.out.println(operand1 + " " + operator + " " + operand2 + " = " + result);
    }

    public static int cal(int operand1, char operator, int operand2) {
        int result;
        switch (operator){
            case '+':
                result = operand1 + operand2;
                break;
            case '-':
                result = operand1 - operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
            case '/':
                result = operand1 / operand2;
                break;
            default:
                result = 0;
                break;
        }
        return result;
    }
}
