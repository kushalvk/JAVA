// Type convartion and casting

public class TypeConvartion_Casting {
    public static void main(String[] args) {
        
        byte b = 127;
        int a = 257;

        // b = a; // it will work b\s byte has store 1 byte and int store 4 byte
        a = b; // convartion
        System.out.println(a); // it can not change in datatype

        b = (byte)a; // casting
        System.out.println(b); // 127 b\s byte has store not larger value (127 max)

        // ----------------

        float f = 5.6f;
        int x = (int)f; // gives 5 only
        System.out.println(x);
    }
}
