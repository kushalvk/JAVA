public class if_else_if_02 {
    public static void main(String[] args) {
        int x = 8;
        int y = 7;
        int z = 6;

        if(x > y && x > z){
            System.out.println(x);
        } else if(y > z){
            System.out.println(y);
        } else {
            System.out.println(z);
        }
    }
}
