import java.util.Scanner;

public class QustionService {
    
    Qustion[] questions = new Qustion[5];

    public QustionService() {
        questions[0] = new Qustion(1,"size of int","2","6","4","8", "4");
        questions[1] = new Qustion(2,"size of double","2","6","4","8", "8");
        questions[2] = new Qustion(3,"size of char","2","6","4","8", "2");
        questions[3] = new Qustion(4,"size of lang","2","6","4","8", "8");
        questions[4] = new Qustion(5,"size of boolean","1","2","4","8", "1");
    }

    String select[] = new String[5];

    public void playquiz() {
        int i = 0;
        for (Qustion q : questions) {
            System.out.println("Question number:- " + q.getId());
            System.out.println("Question :- " + q.getQustion());
            System.out.println("Your Option is as blow");
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());

            System.out.print("Give me your answer :");
            Scanner s = new Scanner(System.in);
            select[i] = s.nextLine();
            i++;

            // if (select[i].equals(q.getAnswer())) {
            //     System.out.println("Right");
            // }
            // else {
            //     System.out.println("Wrong");
            // }
        }

        System.out.println("You selected answer is as blow");
        for (String Sel : select) {
            System.out.println(Sel);
        }
    }

    public void printScore() {
        int Score = 0;

        for (int i = 0; i < questions.length; i++) {
            Qustion que = questions[i];
            String actualAnswer = que.getAnswer();

            String useranswer = select[i];

            if (actualAnswer.equals(useranswer)) {
                Score++;
            }
        }
        System.out.println("Your Score is : " + Score);
    }
}
