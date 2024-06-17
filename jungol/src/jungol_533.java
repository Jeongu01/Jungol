import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class jungol_533 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        char gender;
        int age;

        gender = stringTokenizer.nextToken().charAt(0);
        age = Integer.parseInt(stringTokenizer.nextToken());

        if (gender == 'M' && age >= 18)
            System.out.println("MAN");
        else if (gender == 'M')
            System.out.println("BOY");
        else if (gender == 'F' && age >= 18)
            System.out.println("WOMAN");
        else System.out.println("GIRL");

    }
}
