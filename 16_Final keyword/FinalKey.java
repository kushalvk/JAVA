// Final - Variable, Method, Class

final class A { // with useing a final keyword you can stop a inheritance 
    public final  void show() { // if the method is final then this method can not overraded
        System.out.println("in A show");
    }

    public void add(int a,int b) {
        System.out.println(a+b);
    }
}

// class B extends A { // can't inherit

// }

public class FinalKey {
    public static void main(String[] args) {
        final int num = 7;
        // num = 9; // you can't change the valu if variable is final
        System.out.println(num);

        A obj = new A();
        obj.show();
        obj.add(4, 3);
    }
}
