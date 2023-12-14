/* Datatype
 * 
 * 1) primitive
 *      - Integer -> byte(1 bytes) , short(2 bytes) , int(4 bytes) , long(8 bytes)
 *      - Float -> doudle(8 bytes) , float(4 bytes)
 *      - Character -> string(2 bytes)
 *      - Boolean -> true or false
 */

 public class Datatype_03 {
    public static void main (String b[]) {

        int num1 = 7;
        byte num2 = 127; // 128 will giv you error
        short num3 = 777;
        long num4 = 15987l;

        float num5 = 5.8f; // if you not put 'f' at the end the it's called double
        double num6 = 5.8;

        char num7 = 'k'; // ony access single character and you can will use ony ('') single qats not use ("") double qats and without qats also

        boolean num8 = true;

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);
        System.out.println(num7);
        System.out.println(num8);
    }
 }