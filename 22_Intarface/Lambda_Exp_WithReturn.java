// Lmbada Expretion will use only with the Funactional Intarface
@FunctionalInterface // you can give a only one Method
interface A12 {
    int add(int i,int j);
}

public class Lambda_Exp_WithReturn {
    public static void main(String[] args) {
        A12 obj = (i,j) -> {
                return i + j;
            };

        int result = obj.add(5, 2);
        System.out.println(result);
    }
}
