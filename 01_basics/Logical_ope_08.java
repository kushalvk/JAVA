public class Logical_ope_08 {
    public static void main(String[] args) {
        int x = 7;
        int y = 5;
        int a = 5;
        int b = 9;

        boolean result = x > y && a > b;
        boolean result1 = x > y && a < b;
        boolean result2 = x > y || a < b;
        boolean result3 = x < y || a < b;
        boolean result4 = x < y;

        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(!result4); // '!'' not operator is revers of the output (if true yhen false if false then true)
    }
}
