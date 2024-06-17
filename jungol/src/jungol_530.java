import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class jungol_530 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int age;

        age = Integer.parseInt(stringTokenizer.nextToken());

        if (age >= 20)
            System.out.println("adult");
        else
            System.out.println(20 - age + " years later");
    }
}
