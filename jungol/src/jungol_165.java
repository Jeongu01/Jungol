public class jungol_165 {
    public static void main(String[] args) {
        int[][] arr = new int[5][7];
        arr[0] = new int[]{0, 1, 0, 1, 0, 1, 0};

        System.out.println("1 0 1 0 1");

        for(int i = 1; i < 5; i++) {
            for(int j = 1; j < 6; j++){
                arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j + 1];
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
