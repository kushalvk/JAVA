// encapsulation mean data hiding

class human {
    private int age; // this private variable will only access in this class
    private String name;

    public int getage() {
        return age;
    }

    public void setage(int a) {
        age = a;
    }

    public String getname() {
        return name;
    }

    public void setname( String n) {
        name = n;
    }
}

public class Encapsulation_01 {
    public static void main(String[] args) {
        human obj = new human();
        // obj.age = 11; // you can not access drectly
        // obj.name = "kushal";

        obj.setage(30);
        obj.setname("vaghela");

        System.out.println(obj.getage() + " : " + obj.getname()); // you can access a privat variable by public method
    }
}