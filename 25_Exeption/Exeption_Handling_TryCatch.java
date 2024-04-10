public class Exeption_Handling_TryCatch {
    public static void main(String[] args) {
        int i = 2;
        int j = 0;

        int num[] = new int[5];
        String str = null;

        try {
            j = 18/i;
            System.out.println(str.length());
            System.out.println(num[1]);
            System.out.println(num[5]);
        }
        catch(ArithmeticException e) {
            System.out.println("Can not devaid by Zero.  ");
            // we will use Try with maltiple catch block
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Stay in your limit.");
        }
        catch(Exception e) { // We can not handale Exeption at the first of the Multiple Exeption B/s The Exeption handaled all of the exeption
            System.out.println("Somethings Want Wrong..  " + e);
        }

        System.out.println(j);
        System.out.println("Bye..");
    }    
}
