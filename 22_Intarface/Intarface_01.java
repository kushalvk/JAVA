
interface computer {
    void code();
}

class laptop1 implements computer {
    public void code() {
        System.out.println("code, compile, run");
    }
}

class desktop implements computer {
    public void code() {
        System.out.println("code, compile, run : faster");
    }
}

class devloper {
    public void devApp(computer lap) {
        lap.code();
    }
}

public class Intarface_01 {
    public static void main(String[] args) {

        computer lap = new laptop1();
        computer desk = new desktop();

        devloper vk = new devloper();
        // vk.devApp(lap);
        vk.devApp(desk);
    }    
}
