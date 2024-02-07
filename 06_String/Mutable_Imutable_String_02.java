public class Mutable_Imutable_String_02 {
    public static void main(String[] args) {
        String name = "kushal";
        name = name + " Vaghela";
        System.out.println("Hello " + name);

        String s1 = "Kushal";
        String s2 = "Kushal"; // not create other memory / same memory as s1.

        // Mutable String = changeble
        // Immutable String = unchangeble

        System.out.println(s1);
        System.out.println(s2);
    }
}
