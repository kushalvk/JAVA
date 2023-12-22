import java.util.Scanner;

public class Student_Result {
    public static void main (String r[]) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter a roll number: ");
        s.nextInt();

        int Marks[] = new int[5];

        for(int i = 1 ; i <= 5 ; i++) {
            System.out.println("Marks " + i + ": ");
            Marks[i] = s.nextInt();
        }
    }
}