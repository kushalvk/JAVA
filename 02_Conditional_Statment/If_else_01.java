public class If_else_01 {
    public static void main(String[] args) {
        int x = 8;
        int y = 7;

        if( x > 10 && x <= 20){ // 11 - 20
            System.out.println("Hello");
        }
        else{
            System.out.println("Bye..");
        }

        // --------------

        if(x > y){
            System.out.println(x);
            System.out.println("Thank you");
        } else {
            System.out.println(y);
        }
    }
}
