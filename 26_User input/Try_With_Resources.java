import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Try_With_Resources {
    public static void main(String[] args) throws IOException {

        int num;
        BufferedReader bf = null;
        try {
            InputStreamReader in = new InputStreamReader(System.in);
            bf = new BufferedReader(in);
            num = Integer.parseInt(bf.readLine());
            System.out.println(num);
            
        } catch (Exception e) {
            System.out.println("Somethings want wrong.");
        } finally {
            bf.close();
            System.out.println("Bye...");
        }
    }
}
