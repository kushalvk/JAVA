enum Status {
    Running, Failed, Pending, Success;
}

public class Enum {
    public static void main(String[] args) {
        Status s = Status.Success;
        System.out.println(s);
        System.out.println(s.ordinal()); // for giving an index

        Status[] s1 = Status.values();  // 'values()' is use to print all value in the Statuse
        for (Status sts : s1) {
            System.out.println(sts + " : " + sts.ordinal());
        }
    }    
}
