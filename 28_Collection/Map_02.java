import java.util.HashMap;
import java.util.Map;

public class Map_02 {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>(); // Map can not duplicat the value

        students.put("kushal", 56);
        students.put("Om", 71);
        students.put("Prince", 60);
        students.put("Harshad", 23);
        students.put("Raj", 70);

        students.put("Harshad",20);

        // System.out.println(students);
        // System.out.println(students.get("kushal"));

        // System.out.println(students.keySet());
        // System.out.println(students.values());

        for (String key : students.keySet()) {
            System.out.println(key + " : " + students.get(key));
        }

    }
}
