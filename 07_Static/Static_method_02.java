class Mobile {
    String brand;
    int price;
    static String name;

    public void show()
    {
        System.out.println(brand + " : " + price + " : " + name);
    }

    public static void show1(Mobile obj) {
        System.out.println("in static method");
        // System.out.println(brand + " : " + price + " : " + name); // you can access only static variable inside the static method
        // for ex:- you can access name but you can not access brand and price
        System.out.println(obj.brand + " : " + obj.price + " : " + name); // you can access a static variable with using object
    }
}

public class Static_method_02 {
    public static void main(String[] args) {
        Mobile obj = new Mobile();
        obj.brand = "samsung";
        obj.price = 150000;
        obj.name = "Phone";

        // Mobile.show(); // you can not access non static method with using class
        Mobile.show1(obj); // you can access static variable with using class
    }
}
