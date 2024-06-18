public class jungol_9077 {
    public static void main(String[] args) {
        int[][] intArr = {{3, 5, 4},{2, 6, 7},{8, 10, 1}};

        for(int[] arrElement : intArr){
            for (int element : arrElement)
                System.out.print(element + " ");
            System.out.println();
        }
    }
}
