class A13 {
    public void show() throws ClassNotFoundException{
        Class.forName("calc");
    }
}

public class Throws {
    static {
        System.out.println("clas loaded");
    }
    public static void main(String[] args) {
        A13 obj = new A13();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            System.out.println("Class is not Found");
        }
    }
}
