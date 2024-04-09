enum laptop2 {
    Macbook(2000), XPS(2200), Surface, ThinkPad(1800);

    private int price;

    private laptop2() { //  deafult constractor
        price = 500; // if we notter a price the price will autometicly acsine 500
    }

    private laptop2(int price) { // paramitarice constractore
        this.price = price;
        System.out.println("in laptop " + this.name());
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
}

public class Enum_class {
    public static void main(String[] args) {

        // laptop2 lap = laptop2.Macbook;
        // System.out.println(lap + " : " + lap.getPrice());

        for (laptop2 lpt : laptop2.values()) {
            System.out.println(lpt + " : " + lpt.getPrice());
        }
    }
}
