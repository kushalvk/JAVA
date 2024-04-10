class A10 {
    public void showTheDateWichBelongsToThisClass() {
        System.out.println("in A show");
    }
}
class B10 extends A10 {

    // @Override 
    // public void showTheDateWichBelongsToThisClass() {
    //     // TODO Auto-generated method stub
    //     super.showTheDateWichBelongsToThisClass();
    // }
    @Override // when you use this if the method name is not a same as parent class it will give you error(Annotation)
    public void showTheDateWichBelongsToThisClass() {
        System.out.println("in B show");
    }

    
}

public class Annotation {
    public static void main(String[] args) {
        B10 obj = new B10();
        obj.showTheDateWichBelongsToThisClass();
    }
}