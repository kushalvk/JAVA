public class Literals_04 {
    public static void main(String v[]) {
        
        // literals

        int num1 = 0b101; // it's 5
        System.out.println(num1);

        int num2 = 0x7E; // it's 126
        System.out.println(num2);

        int num3 = 10_00_00_000; // easy to andarstand (output is 100000000)
        System.out.println(num3);

        double num4 = 57; // it's 57.0
        System.out.println(num4);

        double num5 = 57e10; // it's 5.7E11
        System.out.println(num5);

        // boolean num6 = 1; // can not canvart int to boolean
        // System.out.println(num6);

        char num7 = 'v';
        System.out.println(num7);

        char num8 = 'v';
        num8++; // it's 'w'
        System.out.println(num8);
    }
}
