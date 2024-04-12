import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class student2 implements Comparable<student2> {
    int age;
    String name;

    
    public student2(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "student2 [age=" + age + ", name=" + name + "]";
    }

    public int compareTo(student2 that) {
        if (this.age > that.age) {
            return 1;
        } else {
            return -1;
        }
    }

    
}

public class Comparator_Vs_Comparable {
    public static void main(String[] args) {

        // Working with Integer-------------
        // Comparator<Integer> com = new Comparator<Integer>() {
        //     public int compare(Integer i, Integer j) {
        //         // if (i % 10 > j % 10) {
        //         //     return 1;
        //         // } else {
        //         //     return -1;
        //         // }
                
        //         return i % 10 > j % 10 ? 1 : -1; // Tarbary opretore
        //     }
        // };

        // List<Integer> nums = new ArrayList<>();

        // nums.add(43);
        // nums.add(31);
        // nums.add(72);
        // nums.add(99);

        // Collections.sort(nums, com);

        // System.out.println(nums);

        // Working with String----------------

        List<student2> nums1 = new ArrayList<>();

        nums1.add(new student2(21, "kushal"));
        nums1.add(new student2(23, "om"));
        nums1.add(new student2(20, "harshad"));
        nums1.add(new student2(22, "vijay"));

        Collections.sort(nums1);

        for (student2 s : nums1) {
            System.out.println(s);
        }
    }
}
// Comparable is a intarface and it's campalsary to declare a 'compareTo' Method
// AND
// Comparator is a function to use Anonimus class