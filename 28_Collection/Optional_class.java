import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Optional_class {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Kushal","Om","Harshad","Prince","Vijay");

        // First way
        // Optional<String> name = names.stream()
        //                              .filter(str -> str.contains("a")) // which name cantain 'a' element
        //                              .findFirst(); // find the first values of the above element if not it will give you a runtime error

        // System.out.println(name.orElse("Not Found")); // if it's give a error then the custome msg. will given by "orElse" Method.

        // Second way (without Optional class)
        String name1 = names.stream()
                                     .filter(str -> str.contains("x"))
                                     .findFirst()
                                     .orElse("Not Found"); // if it's give a error then the custome msg. will given by "orElse" Method.

        System.out.println(name1);

        
    }
}
