class A2 {
    public int show(int n1,int n2) {
        return n1 + n2;
    }
}
class B2 extends A2 {
    public int show(int n1,int n2) { // this is method overraiding
        return n1 + n2 + 1;
    }
}

public class Overraiding_01 {
    public static void main(String[] args) {
        B2 obj = new B2();
        obj.show(4, 3);
    }
}