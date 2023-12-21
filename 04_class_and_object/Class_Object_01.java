
class Calculator {
    int a; 

    public int add(int n1, int n2) {
        int r = n1 + n2;
        return r;
    }
}

public class Class_Object_01 {
    public static void main(String[] args) {
        // int num1 = 4;
        // int num2 = 5;

        // int result = num1 + num2;

        Calculator cal = new Calculator();
        int result = cal.add(4,5);

        System.out.println(result);
    }
}