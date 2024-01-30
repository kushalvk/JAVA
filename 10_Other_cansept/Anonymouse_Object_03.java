class A {
    public A() {
        System.out.println("Object created");
    }

    public void show() {
        System.out.println("in A show");
    }
}

public class Anonymouse_Object_03 {
    public static void main(String[] args) {

        // A obj = new A();
        // Same as
        new A(); // Anonymouse Object(Use only one time)
        // new A().show(); // call other method throw object

    }
}
