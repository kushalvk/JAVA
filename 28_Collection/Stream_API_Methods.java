import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Stream_API_Methods {
    public static void main(String[] args) {
        
        List<Integer> nums = Arrays.asList(8,4,6,6,9,3);

        // following are three way to print a 'List'.

        // for (int i = 0; i < nums.size(); i++) {
        //     System.out.println(nums.get(i));
        // }

        // for (int n : nums) {
        //     System.out.println(n);
        // }

        // forEach Method
        // nums.forEach(n -> System.out.println(n));
        
        Consumer<Integer> con = n -> { // lambda Expretion b/s the Consumer is a @Functional Intaface
            System.out.println(n);
        };

        nums.forEach(con);

        // int sum = 0;
        // for (int n : nums) {
        //     if (n % 2 == 0) {
        //         n = n * 2;
        //         sum = sum + n;
        //     }
        // }
        // System.out.println(sum);
    }
}
