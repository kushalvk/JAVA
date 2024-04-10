@FunctionalInterface // you can give a only one initarface
interface A1 {
    void show();
}
// class B11 implements A1 {
//     public void show() {
//         System.out.println("in B show");
//     }
// }

public class Functional_Intarface {
    public static void main(String[] args) {
        A1 a = new A1() {
            public void show() {
                System.out.println("in Anonimuce Show");
            }
        };
        a.show();
    }
}
