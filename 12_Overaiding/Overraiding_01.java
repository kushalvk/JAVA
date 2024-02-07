class A {
    public int show(int n1,int n2) {
        return n1 + n2;
    }
}
class B extends A {
    public int show(int n1,int n2) { // this is method overraiding
        return n1 + n2 + 1;
    }
}

public class Overraiding_01 {
    public static void main(String[] args) {
        B obj = new B();
        obj.show(4, 3);
    }
}
