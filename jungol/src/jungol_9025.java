public class jungol_9025 {
    public static void main(String[] args) {
        int result1, result2, result3, result4;
        boolean a = false, b = true, c = true;

        result1 = a&&b ? 1 : 0;
        result2 = a||b ? 1 : 0;
        result3 = b&&c ? 1 : 0;
        result4 = !a ? 1 : 0;

        System.out.println(result1 + " " + result2 + " " + result3 + " " + result4);
    }
}
