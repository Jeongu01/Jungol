import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class jungol_9038 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int a, b, result;

        a = Integer.parseInt(stringTokenizer.nextToken());
        b = Integer.parseInt(stringTokenizer.nextToken());

        result = a > b ? a : b;
        System.out.println(result);
    }
}
