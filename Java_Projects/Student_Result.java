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

        // int Arr[] = {10,20,30,40,50};
        // int Total = Arr[0] + Arr[1] + Arr[2] + Arr[3] + Arr[4];

        // System.out.println("Total: "+ Total);

        // int Result = Total/5;
        // System.out.println(Result);
    }
}