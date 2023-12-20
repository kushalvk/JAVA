public class While_loop_02 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            System.out.println("HI...! Kushal " + i);

            int  j = 1;
            while (j <= 3) {
                System.out.println("Hello " + j);
                j++;
            }

            i++;
        }
        System.out.println("Bye " + i);
    }
}
