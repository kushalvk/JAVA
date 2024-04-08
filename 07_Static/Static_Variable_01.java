class Mobile2 {
    String brand;
    int price;
    static String name;

    public void show() {
        System.out.println(brand + " : " + price + " : " + name);
    }
}

public class Static_Variable_01 {
    public static void main(String[] args) {
        Mobile2 obj1 = new Mobile2();
        obj1.brand = "Apple";
        obj1.price = 1500;
        obj1.name = "SmartPhone";

        Mobile2 obj2 = new Mobile2();
        obj2.brand = "Samsung";
        obj2.price = 1700;
        obj2.name = "SmartPhone";

        obj1.name = "Phone";

        obj1.show();
        obj2.show();
    }
}
