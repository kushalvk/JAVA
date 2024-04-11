import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Collaction_interface {
    public static void main(String[] args) {
        // Collection<Integer> nums = new ArrayList<Integer>(); 
        // nums.add(6);
        // nums.add(7);
        // nums.add(8);
        // nums.add(9);
        // nums.add(5);
        // nums.add("5"); // It will give you an error b/s it's not a Integer

        // for (int nem : nums) {
        //     System.out.println(nem);
        // }

        // List // if you have work with index value you can use List at the place of Collection.
        // List<Integer> nums1 = new ArrayList<Integer>();
        // nums1.add(6);
        // nums1.add(7);
        // nums1.add(8);
        // nums1.add(9);
        // nums1.add(5);

        // System.out.println(nums1.get(1));
        // System.out.println(nums1.indexOf(7));

        // Set  // 'Set' can not duplicat the value (it collactin of 'Uniqe' values)
        // Set<Integer> nums2 = new HashSet<Integer>();  
        // nums2.add(62);
        // nums2.add(74);
        // nums2.add(74);
        // nums2.add(86);
        // nums2.add(98);
        // nums2.add(86);
        // nums2.add(51);
        // nums2.add(62);

        // for (int nem : nums2) {
        //     System.out.println(nem);
        // }

        // TreeSet // if you work with sorted values then you can use "TreeSet"
        Collection<Integer> nums3 = new TreeSet<Integer>();
        nums3.add(6);
        nums3.add(7);
        nums3.add(8);
        nums3.add(9);
        nums3.add(5);

        Iterator<Integer> values = nums3.iterator();

        while (values.hasNext()) {
            System.out.println(values.next());
        }
    }
}