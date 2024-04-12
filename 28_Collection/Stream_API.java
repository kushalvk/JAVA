import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Stream_API {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(8,4,6,6,9,3);

        // Stream<Integer> s1 = nums.stream(); // Onec you can use of Stream you can not reuse it.
        // s1.forEach(n -> System.out.println(n));

        // Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);
        // s2.forEach(n -> System.out.println(n));

        // Stream<Integer> s3 = s2.map(n -> n*2);
        // s3.forEach(n -> System.out.println(n));

        // int result = s3.reduce(0, (c,e) -> c+e);
        // System.out.println(result);

        // you can do above all opration in one line
        // int result1 = nums.stream()
        //                 .filter(n -> n%2 == 0)
        //                 .map(n -> n*2)
        //                 .reduce(0, (c,e) -> c+e);
        // System.out.println(result1);

        // Predicate comes from a 'filter' Method (logic)
        Predicate<Integer> p = new Predicate<Integer>() {
            public boolean test(Integer n) {
                if (n%2 == 0) {
                    return true;
                } else {
                    return false;
                }
            } 
        };

        // Predicate comes from a 'map' Method (logic)
        Function<Integer, Integer> fun = n -> n*2; // Lambda Expretion

        int result1 = nums.stream()
                        .filter(p)
                        .map(fun)
                        .reduce(0, (c,e) -> c+e);
        System.out.println(result1);
    }
}
