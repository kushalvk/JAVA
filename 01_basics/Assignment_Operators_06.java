// Assignment Operator

public class Assignment_Operators_06 {
    public static void main(String[] args) {
        int num = 7;
        int num2 = 5;

        int result = num + num2;
        System.out.println(result);

        int result2 = num - num2;
        System.out.println(result2);

        int result3 = num * num2;
        System.out.println(result3);

        int result4 = num / num2; // 1
        System.out.println(result4);

        int result5 = num % num2;
        System.out.println(result5);

        // num = num + 2;
        // num += 2;
        // num -= 2;
        // num *= 2; // 7 * 2

        // num += 1;
        // num++; // post - increment
        // ++num; // pre - increment
        // num--; // post - dicriment 
        // --num; // pre - dicriment
        System.out.println(num);

        // --------------------

        int result6 = num++; // first fatch the value then after incriment in post-increment
        int result7 = ++num; // fiest increment the valu and the print
        System.out.println(result6);
        System.out.println(result7);
    }
}
