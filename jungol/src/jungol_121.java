import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class jungol_121 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int a;

        a = Integer.parseInt(stringTokenizer.nextToken());

        if (a == 0)
            System.out.println("zero");
        else if (a > 0)
            System.out.println("plus");
        else System.out.println("minus");
    }
}
