import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class jungol_122 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int year;

        year = Integer.parseInt(stringTokenizer.nextToken());

        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
            System.out.println("leap year");
        else System.out.println("common year");
    }
}
