class human {
    private int age;
    private String name;

    public human() {
        age = 12; // if we are not assign any value then this is a by default value.
        name = "kushal";
    }

    public human(int a, String n) {
        age = a;
        name = n;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }    
}

public class Constractor_01 {
    public static void main(String[] args) {
        human obj = new human();
        human obj1 = new human(20, "Kushal"); // at every time we create  objet at that time cnstractor will call automaticaly

        System.out.println(obj.getAge() + " : " + obj.getName());
    }
}
