class Mobile {
    String brand;
    int price;
    static String name;

    static { // a static block is create only a one  // if don't create a object thrn static and class can not be lord
        name = "Phone";
        System.out.println("in static block");
    }

    public Mobile() {
        brand = "";
        price = 200;
        // name = "Phone"; // the name can not be access because it is a static
        System.out.println("in canstractor");
    }

    public void show()
    {
        System.out.println(brand + " : " + price + " : " + name);
    }
}

public class Static_block_03 {
    public static void main(String[] args) throws ClassNotFoundException{
        Class.forName("Mobile");

        // Mobile obj = new Mobile();
        // obj.brand = "samsung";
        // obj.price = 150000;
        // Mobile.name = "SmartPhone";

        // Mobile obj2 = new Mobile();
        
    }
}
