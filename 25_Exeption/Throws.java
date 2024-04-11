class A12 {
    public void show() throws ClassNotFoundException{
        Class.forName("calc");
    }
}

public class Throws {
    static {
        System.out.println("clas loaded");
    }
    public static void main(String[] args) {
        A12 obj = new A12();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            System.out.println("Class is not Found");
        }
    }
}
