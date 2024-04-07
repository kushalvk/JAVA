class A {
    public void show(){
        System.out.println("in A show");
    }
}
class B extends A {
    public void show1(){
        System.out.println("in B show");
    }
}

public class Type_Casting {
    public static void main(String[] args) {
        double d = 4.5;
        int i = (int) d;
        System.out.println(i);

        // Upcasting usng Object
        A obj = (A) new B();
        obj.show();
        // obj.show1(); // you can't access it

        // Downcasting usng Object
        B obj1 = (B) obj;
        obj1.show1();

    }
}
