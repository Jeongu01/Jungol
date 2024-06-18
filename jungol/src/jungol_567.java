public class jungol_567 {
    public static void main(String[] args) {
        int[][] intArr = {{5,8,10,6,4},{11,20,1,13,2},{7,9,14,22,3}};

        for(int[] arrElement : intArr){
            for(int element : arrElement){
                System.out.printf("%2d   ", element);
            }
            System.out.println();
        }
    }
}
