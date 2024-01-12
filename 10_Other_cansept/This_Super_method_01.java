class A extends Object { // this extends "Object" is by default in every base class.
    public A() {
        super();
        System.out.println("in A");
    }
    public A(int n) {
        super();
        System.out.println("in A int");
    }
}

class B extends A{
    public B() {
        super(); // if we pasing a paramitar the super class is called paramitaraic canstractor
        System.out.println("in B");
    }
    public B(int n) {
        // super(n); // int this select the paramitarice canstractar.
        // if we not defaind a paramitar(n) the it select a default canstractore
        this(); // "this" will execute the canstractor of a same class
        System.out.println("in B int");
    }
}

// the super() it go to this super(parent/base) class

public class This_Super_method_01 {
    public static void main(String[] args) {
        B obj = new B(5);
        // B obj = new B();

    }
}
