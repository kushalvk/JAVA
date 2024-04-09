abstract class A8 {
    public abstract void show4();
    public abstract void config1();
}

public class Abstract_and_Anonymouse {
    public static void main(String[] args) {
        A8 obj = new A8() {
            public void show4() {
                System.out.println("in new A show");
            }

            public void config1() {
                System.out.println("in config");
            }
        };
        obj.show4();
        obj.config1();
    }
}
