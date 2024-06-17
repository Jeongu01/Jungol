import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class jungol_120 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int a, b, bigNum, smallNum;

        a = Integer.parseInt(stringTokenizer.nextToken());
        b = Integer.parseInt(stringTokenizer.nextToken());

        if (a > b) {
            bigNum = a;
            smallNum = b;
        } else {
            bigNum = b;
            smallNum = a;
        }

        System.out.println(bigNum - smallNum);
    }
}
