import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class jungol_555 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        char[] charArr;
        charArr = new char[10];

        for(int i = 0; i < 10; i++) {
            charArr[i] = stringTokenizer.nextToken().charAt(0);
        }

        for(char ch : charArr){
            System.out.print(ch);
        }
    }
}
