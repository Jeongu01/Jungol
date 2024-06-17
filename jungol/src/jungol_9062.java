public class jungol_9062 {
    public static void main(String[] args) {
        char ch = 'a';
        int count = 1;
        for(int i = 0; i < 4; i++) {
            for (int j = i; j >= 0; j--) {
                System.out.print(ch++ + " ");
            }
            for (int j = i; j < 4; j++) {
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }
}
