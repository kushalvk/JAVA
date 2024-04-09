interface A8 {
    int age = 21;    // all the variable are final and static
    String area = "Surat";

    void show4();
    void config4();
}

class B8 implements A8 { // inplement Intarface - all the method are declared in intarface are applay in class campalsary
    public void show4(){
        System.out.println("in show");
    }
    public void config4() {
        System.out.println("in config");
    }
}

public class Intarface_02 {
    public static void main(String[] args) {
        A8 obj = new B8();
        obj.show4();
        obj.config4();

        // A8.age = 22; // you can't change the value of age b/s it's 'final'

        System.out.println(A8.area);
    }
}
