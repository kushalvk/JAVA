class Calculator {
    public int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }
    public int add(int n1, int n2) {
        return n1 + n2;
    }
    public double add(double n1, int n2) {
        return n1 + n2;
    }
}

public class Method_Overloding_03 {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        int c1 = cal.add(3, 4);
        int c2 = cal.add(3, 4, 5);
        System.out.println(c1);
        System.out.println(c2);
    }
}
