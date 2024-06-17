import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class jungol_632 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int a, b, c;

        a = Integer.parseInt(stringTokenizer.nextToken());
        b = Integer.parseInt(stringTokenizer.nextToken());
        c = Integer.parseInt(stringTokenizer.nextToken());

        if(a < b && a < c)
            System.out.println(a);
        else if (b < a && b < c)
            System.out.println(b);
        else System.out.println(c);
    }
}
