import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class jungol_534 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        char score;

        score = stringTokenizer.nextToken().charAt(0);

        if (score == 'A')
            System.out.println("Excellent");
        else if (score == 'B')
            System.out.println("Good");
        else if (score == 'C')
            System.out.println("Usually");
        else if (score == 'D')
            System.out.println("Effort");
        else if (score == 'F')
            System.out.println("Failure");
        else
            System.out.println("error");
    }
}
