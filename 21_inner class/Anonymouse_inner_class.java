class A7 {
    public void show3() {
        System.out.println("in A show");
    }
}

public class Anonymouse_inner_class {
    public static void main(String[] args) {
        A7 obj = new A7() {
            public void show3() {
                System.out.println("in new A show");
            }
        };
        obj.show3();
    }
}
