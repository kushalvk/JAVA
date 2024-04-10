@FunctionalInterface // you can give a only one Method
interface A11 {
    void show(int i);
}
// class B11 implements A11 {
//     public void show() {
//         System.out.println("in B show");
//     }
// }

public class Functional_Intarface {
    public static void main(String[] args) {
        A11 a = new A11() {
            public void show(int i) {
                System.out.println("in Anonimuce Show" + i);
            }
        };
        a.show(5);

        A11 aa = (i) -> { // Lambda Expretion (but in a single function)(ex:-Functional Intaface)
                System.out.println("in Anonimuce Show" + i);
            };
        aa.show(7);
        // Lmbada Expretion will use only with the Funactional Intarface
    }
}
