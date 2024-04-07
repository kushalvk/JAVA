class laptop {
    String model;
    int price;

    // public String toString() {
    //     // return "Hey..!";
    //     return model + " : " + price;
    // }

    // Automatic -> right click on class - Source Action - generat Hashcode() and equals() - select object - ok
    @Override
    public String toString() {
        return "laptop [model=" + model + ", price=" + price + "]";
    }

    // public boolean equqls(laptop other) {
    //     if(this.model.equals(that.model) && this.price == that.price) {
    //         return true;
    //     }
    //     else {
    //         return false;
    //     }
    // }

    // Automatic -> right click on class - Source Action - generat Hashcode() and equals() - select object - ok
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        laptop other = (laptop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }
    
}

public class Object_Class_Methods {
    public static void main(String[] args) {
        laptop lap = new laptop();
        lap.model = "Lenovo";
        lap.price = 70000;

        laptop lap1 = new laptop();
        lap1.model = "Lenovo";
        lap1.price = 70000;

        // boolean result = lap == lap1;
        boolean result = lap.equals(lap1);
        System.out.println(result);

        // System.out.println(lap);
        System.out.println(lap.toString());
    }
}

// you can access any of the one tostring,hashcode and equals method