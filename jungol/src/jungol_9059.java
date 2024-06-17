public class jungol_9059 {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++) {
            for (int j = i; j < 4; j ++){
                System.out.print(" ");
            }
            for (int j = 2 * i; j >= 0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
