class Number{
    static int num = 0;
    int num2 = 0;

    public static void printNum() {
        System.out.println(num);
    }
    public void printNum2() {
        System.out.println(num2);
    }
}
public class Main {
    public static void main(String[] args) {
        Number number1 = new Number();
        Number number2 = new Number();

        number1.num++;
        number1.num2++;

        System.out.println(number2.num);
        System.out.println(number2.num2);
        Math.pow(2,3);
        Number.printNum();
        number2.printNum2();
    }
}