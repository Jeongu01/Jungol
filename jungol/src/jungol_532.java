import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class jungol_532 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        double a, b;

        a = Double.parseDouble(stringTokenizer.nextToken());
        b = Double.parseDouble(stringTokenizer.nextToken());

        if (a >= 4.0 && b >= 4.0)
            System.out.println("A");
        else if (a >= 3.0 && b >= 3.0)
            System.out.println("B");
        else
            System.out.println("C");
    }
}
