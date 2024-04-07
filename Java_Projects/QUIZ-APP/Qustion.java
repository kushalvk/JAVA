
public class Qustion {
    private int id;
    private String Qustion;
    private String Opt1;    
    private String Opt2;    
    private String Opt3;    
    private String Opt4;
    private String Answer;

    

    public Qustion(int id, String qustion, String opt1, String opt2, String opt3, String opt4, String answer) {
        this.id = id;
        this.Qustion = qustion;
        this.Opt1 = opt1;
        this.Opt2 = opt2;
        this.Opt3 = opt3;
        this.Opt4 = opt4;
        this.Answer = answer;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getQustion() {
        return Qustion;
    }
    public void setQustion(String qustion) {
        Qustion = qustion;
    }
    public String getOpt1() {
        return Opt1;
    }
    public void setOpt1(String opt1) {
        Opt1 = opt1;
    }
    public String getOpt2() {
        return Opt2;
    }
    public void setOpt2(String opt2) {
        Opt2 = opt2;
    }
    public String getOpt3() {
        return Opt3;
    }
    public void setOpt3(String opt3) {
        Opt3 = opt3;
    }
    public String getOpt4() {
        return Opt4;
    }
    public void setOpt4(String opt4) {
        Opt4 = opt4;
    }
    public String getAnswer() {
        return Answer;
    }
    public void setAnswer(String answer) {
        Answer = answer;
    }
    @Override
    public String toString() {
        return "Qustion [id=" + id + ", Qustion=" + Qustion + ", Opt1=" + Opt1 + ", Opt2=" + Opt2 + ", Opt3=" + Opt3
                + ", Opt4=" + Opt4 + ", Answer=" + Answer + "]";
    }
    
}
