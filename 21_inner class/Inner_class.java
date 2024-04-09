

class A6 {
    int age;

    public void show2() {
        System.out.println("in show");
    }

    class B6 {
        public void config() {
            System.out.println("in config");
        }
    }

    static class C6 {
        public void st() {
            System.out.println("in static");
        }
    }
}

public class Inner_class {
    public static void main(String[] args) {
        A6 obj = new A6();
        obj.show2();

        A6.B6 obj1 = obj.new B6();
        obj1.config();

        A6.C6 obj2 = new A6.C6(); // if inner class is static
        obj2.st();
    }
}
