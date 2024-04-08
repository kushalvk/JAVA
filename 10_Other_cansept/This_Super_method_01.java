class A1 extends Object { // this extends "Object" is by default in every base class.
    public A1() {
        super();
        System.out.println("in A1");
    }
    public A1(int n) {
        super();
        System.out.println("in A1 int");
    }
}

class B1 extends A1{
    public B1() {
        super(); // if we pasing a paramitar the super class is called paramitaraic canstractor
        System.out.println("in B1");
    }
    public B1(int n) {
        // super(n); // int this select the paramitarice canstractar.
        // if we not defaind a paramitar(n) the it select a default canstractore
        this(); // "this" will execute the canstractor of a same class
        System.out.println("in B1 int");
    }
}

// the super() it go to this super(parent/base) class

public class This_Super_method_01 {
    public static void main(String[] args) {
        B1 obj = new B1(5);
//         B1 obj = new B1();

    }
}
