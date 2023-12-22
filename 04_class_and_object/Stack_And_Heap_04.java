class Calc {
    int num = 5;
    
    public int add(int n1, int n2) {
        return n1 + n2;
    }
}

public class Stack_And_Heap_04 {
    public static void main(String[] args) {
        Calc obj = new  Calc();
        Calc obj1 = new  Calc();

        obj.num = 8;
        
        System.out.println(obj.num);
        System.out.println(obj1.num);
    }
}
