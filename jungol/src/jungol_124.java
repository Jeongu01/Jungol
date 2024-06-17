import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class jungol_124 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int a;

        a = Integer.parseInt(stringTokenizer.nextToken());

        if (a == 2)
            System.out.println("28");
        else if (a % 2 == 0 && a <= 7)
            System.out.println("30");
        else if (a % 2 == 0)
            System.out.println("31");
        else if (a % 2 == 1 && a <= 7)
            System.out.println("31");
        else System.out.println("30");
    }
}
