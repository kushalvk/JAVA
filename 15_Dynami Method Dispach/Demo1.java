// Dynamic methid dispach

class A3 {
    public void show() {
        System.out.println("in A show");
    }
}
class B3 extends A3 {
    public void show() {
        System.out.println("in B show");
    }
}
class C3 extends A3 {
    public void show() {
        System.out.println("in C show");
    }
}

public class Demo1 {
    public static void main(String[] args) {
        A3 obj = new A3();
        obj.show(); // in A show

        obj = new B3();
        obj.show(); // in B show

        obj = new C3();
        obj.show(); // in C show
    }
}