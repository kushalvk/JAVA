abstract class car {
    public abstract void drive();
    public abstract void fly();

    public void playMusic() {
        System.out.println("Play music");
    }
}

abstract class WagonR extends car {
    // if the class is 'abstract' then you should aeble to skip some metod that declar by perant class
    public void drive() { // compalsary defain a method b/s 'car' is abstract class and this class is exteding it
        System.out.println("Driving...");
    }
}

class UpdatedWegonR extends WagonR {    //  concrete class

    public void fly() {
        System.out.println("Fly..");
    }
    
}

public class Abstract_Class {
    public static void main(String[] args) {
        // car obj = new car(); // you can not create a object of abstract class
        car obj = new UpdatedWegonR(); // but you can create a object of his child class
        obj.drive();
        obj.playMusic();
    }    
}
