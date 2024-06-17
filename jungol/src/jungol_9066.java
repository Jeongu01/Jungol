public class jungol_9066 {
    public static void main(String[] args) {
        char[] charArr;
        charArr = new char[26];
        char ch = 'Z';

        for (int i = 0; i < 26; i++){
            charArr[i] = ch--;
        }

        for(char c : charArr) {
            System.out.print(c + " ");
        }
    }
}
