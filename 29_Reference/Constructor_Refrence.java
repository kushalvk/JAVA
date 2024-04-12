import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }

}

public class Constructor_Refrence {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Kushal", "Om", "Harshad", "Prince", "Vijay");

        List<Student> students1 = new ArrayList<>();

        // for (String name : names) {
        //     students1.add(new Student(name));
        // }

        // students1 = names.stream()
        //                  .map(name -> new Student(name))
        //                  .toList();

        students1 = names.stream()
                         .map(Student::new) // Constructor Refrence
                         .toList();

        System.out.println(students1);
    }
}
