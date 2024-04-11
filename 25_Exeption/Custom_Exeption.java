class KushalException extends Exception{ // this is the custome Exception
    public KushalException(String str) {
        super(str); // Exception clas has a cunstructor that use to pass a msg.
    }
}

public class Custom_Exeption {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        try {
            j = 18/i;
            if (j == 0) {
                throw new KushalException("I dont want print zero");
            }
        } catch (KushalException e) {
            j = 18/1;
            System.out.println("That is default output  " + e);
        } catch (Exception e) {
            System.out.println("Somethings Want Wrong..." + e);
        }

        System.out.println(j);
        System.out.println("Bye...");
    }
}