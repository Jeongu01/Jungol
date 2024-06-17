public class jungol_556 {
    public static void main(String[] args) {
        int[] intArr;
        intArr = new int[10];

        for(int i = 0; i < 10; i++) {
            intArr[i] = i + 1;
        }

        for(int i : intArr){
            System.out.print(i + " ");
        }
    }
}
