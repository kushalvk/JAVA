
interface computer1 {
    void code();
}

class laptop1 implements computer1 {
    public void code() {
        System.out.println("code, compile, run");
    }
}

class desktop implements computer1 {
    public void code() {
        System.out.println("code, compile, run : faster");
    }
}

class devloper {
    public void devApp(computer1 lap) {
        lap.code();
    }
}

public class Intarface_01 {
    public static void main(String[] args) {

        computer1 lap = new laptop1();
        computer1 desk = new desktop();

        devloper vk = new devloper();
        // vk.devApp(lap);
        vk.devApp(desk);
    }    
}
