// Dynamic methid dispach

class A {
    public void show() {
        System.out.println("in A show");
    }
}
class B extends A {
    public void show() {
        System.out.println("in B show");
    }
}
class C extends A {
    public void show() {
        System.out.println("in C show");
    }
}

public class Demo {
    public static void main(String[] args) {
        A obj = new A();
        obj.show(); // in A show

        obj = new B();
        obj.show(); // in B show

        obj = new C();
        obj.show(); // in C show
    }
}