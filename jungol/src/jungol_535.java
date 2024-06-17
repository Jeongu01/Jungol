import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class jungol_535 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        double score;

        score = Double.parseDouble(stringTokenizer.nextToken());

        switch ((int) score) {
            case 4:
                System.out.println("scholarship");
                break;
            case 3:
                System.out.println("next semester");
                break;
            case 2:
                System.out.println("seasonal semester");
                break;
            default:
                System.out.println("retake");
        }
    }
}
