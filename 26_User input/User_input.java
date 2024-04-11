import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class User_input {
    public static void main(String[] args) throws IOException {

        System.out.println("Enter a number (Bufferreader)");
        
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);
        int num = Integer.parseInt(bf.readLine());
        System.out.println(num);

        bf.close();

        System.out.println("Enter a number (Scanner)");

        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        System.out.println(num1);

        s.close();
    }    
}
