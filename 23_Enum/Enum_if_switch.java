enum Status1 {
    Running, Failed, Pending, Success;
}

public class Enum_if_switch {
    public static void main(String[] args) {
        Status1 s = Status1.Pending;
        
        if (s.equals(Status1.Running)) {
            System.out.println("All Good");
        } else if (s == Status1.Failed) {
            System.out.println("Try Again");
        } else if (s == Status1.Pending) {
            System.out.println("Please Wait");
        } else if (s == Status1.Success) {
            System.out.println("Done");
        } else {
            System.out.println("Could faind Statuse");
        }

        Status1 s1 = Status1.Success;

        switch (s1) {
            case Running:
                System.out.println("All Good");
                break;
            case Failed:
                System.out.println("Try Again");
                break;
            case Pending:
                System.out.println("Please Wait");
                break;
        
            default:
                System.out.println("Done");
                break;
        }
    }
}
