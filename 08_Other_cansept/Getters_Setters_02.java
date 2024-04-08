// you can add automatic getters and setters for each variable
// steps :- set cursor in the class -> right click in the class 
//       -> click on source Action -> click on generet getters and setters
//       -> select that vriable you want to generet -> click 'ok'
class human1 {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }
    public void setAge(int a) {
        a = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String n) {
        n = name;
    }
}

public class Getters_Setters_02 {
    public static void main(String[] args) {
        human1 obj = new human1();
        // obj.age = 11; // you can not access drectly
        // obj.name = "kushal";

        obj.setAge(30);
        obj.setName("vaghela");

        System.out.println(obj.getAge() + " : " + obj.getName());
    }
}