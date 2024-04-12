import java.util.Arrays;
import java.util.List;

public class Method_Reference {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Kushal","Om","Harshad","Prince","Vijay");

        List<String> uNames = names.stream()
                                    .map(String::toUpperCase) // Referece Method
                                    .toList();

        uNames.forEach(System.out::println);

    }
}
