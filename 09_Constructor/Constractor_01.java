class human {
    private int age;
    private String name;

    public human() {
        age = 12; // if we are not assign any value then this is a by default value.
        name = "kushal";
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
        human obj1 = new human(); // at every time we create  objet at that time cnstractor will call automaticaly
        // obj.age = 11; // you can not access drectly
        // obj.name = "kushal";

        System.out.println(obj.getAge() + " : " + obj.getName());

        // obj.setAge(30);
        // obj.setName("vaghela");

        // System.out.println(obj.getAge() + " : " + obj.getName());
    }
}
