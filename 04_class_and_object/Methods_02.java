class computer {
    public void playMusic(){
        System.out.println("Music Playing...");
    }

    public String getMeAPen(int cost) {
        if(cost >= 10){ // then cost is less then 10 than print nothing
            return "pen";
        } else {
            return "nothing";
        }
        
    }
}

public class Methods_02 {
    public static void main(String[] args) {
        computer com = new computer();
        com.playMusic();
        String str = com.getMeAPen(1);
        System.out.println(str);
    }
}
