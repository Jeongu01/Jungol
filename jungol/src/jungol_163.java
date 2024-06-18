public class jungol_163 {
    public static void main(String[] args) {
        int[][] arr = {{3, 5, 9}, {2, 11, 5}, {8, 30, 10}, {22, 5, 1}};
        int sum = 0;

        for(int[] arrElement : arr){
            for(int elem : arrElement) {
                System.out.print(elem + " ");
                sum += elem;
            }
            System.out.println();
        }

        System.out.println(sum);
    }
}
