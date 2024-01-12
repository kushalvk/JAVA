import java.util.Scanner;

public class Student_Result {
    public static void main (String r[]) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter a roll number: ");
        s.nextInt();

        int Marks[] = new int[6];

        for(int i = 1 ; i <= 5 ; i++) {
            System.out.println("Marks " + i + ": ");
            Marks[i] += s.nextInt();
        }
        int Total = Marks[1] + Marks[2] + Marks[3] + Marks[4] + Marks[5];

        System.out.println("Total: "+ Total);

        int Result = Total/5;
        System.out.println("Your result is " + Result + " %");
        
        if(Result < 30) {
            System.out.println("you are FAIL ....beter luck next time ....!");
        } else {
            System.out.println("You are PASS ...Congrats...!");
        }

        s.close();
    }
}