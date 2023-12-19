// Ternary

public class Ternary_03 {
    public static void main(String[] args) {
        int n = 7;
        int result = 0;

        if( n % 2 == 0){ // that candition check number is even
            result = 10;
        } else {
            result = 20;
        }
        System.out.println(result);

        // ?:

        // result = n % 2 == 0 ? 10 : 20; // this is same as abov loop
        // System.out.println(result);
    }
}
