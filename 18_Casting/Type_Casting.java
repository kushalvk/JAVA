class A5 {
    public void show(){
        System.out.println("in A show");
    }
}
class B5 extends A5 {
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
        A5 obj = (A5) new B5();
        obj.show();
        // obj.show1(); // you can't access it

        // Downcasting usng Object
        B5 obj1 = (B5) obj;
        obj1.show1();

    }
}
