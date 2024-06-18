public class jungol_9080 {
    public static void main(String[] args) {
        int[][] arr = new int[5][6];
        arr[0][1] = 1;
        System.out.println("1");
        for(int i = 1; i < 5; i++) {
            for (int j = 1; j <= 5; j++){
                arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
                if(arr[i][j] != 0)
                    System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
