class human4 {
    private int age;
    private String name;

    public human4() { // default canstractor
        age = 12;
        name = "kushal";
    }

    public human4(int a, String n) { // Parameterized canstractor
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

public class Parameterized_con_02 {
    public static void main(String[] args) {
        human4 obj = new human4();
        human4 obj1 = new human4(20, "Kushal");

        System.out.println(obj.getAge() + " : " + obj.getName());
        System.out.println(obj1.getAge() + " : " + obj1.getName());
    }
}
