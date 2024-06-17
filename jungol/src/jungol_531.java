import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class jungol_531 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        double weight;

        weight = Double.parseDouble(stringTokenizer.nextToken());

        if(weight<=50.80)
            System.out.println("Flyweight");
        else if(weight<=61.23)
            System.out.println("Lightweight");
        else if(weight<=72.57)
            System.out.println("Middleweight");
        else if(weight<=88.45)
            System.out.println("Cruiserweight");
        else
            System.out.println("Heavyweight");
    }
}
