class human {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age; // this keyword is mean this methos's age not an outside the age variable
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name; // this keyword mean instance variable not an local variable
    }

    
}

public class This_keyword_03 {
    public static void main(String[] args) {
        human obj = new human();
        // obj.age = 11; // you can not access drectly
        // obj.name = "kushal";

        obj.setAge(30);
        obj.setName("vaghela");

        System.out.println(obj.getAge() + " : " + obj.getName());
    }
}