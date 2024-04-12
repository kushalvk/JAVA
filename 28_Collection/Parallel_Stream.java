import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Parallel_Stream {
    public static void main(String[] args) {

        int size = 10000;
        List<Integer> nums = new ArrayList<>(size);

        Random ran = new Random(); // for Genreting a number values

        for (int i = 1; i < size; i++) {
            nums.add(ran.nextInt(100));
        }

        // System.out.println(nums); // it will give you all the 10000 number 

        // int sum = nums.stream()
        //             .map(i -> i*2)
        //             .reduce(0, (c, e) -> c+e);

        long startseq = System.currentTimeMillis(); // to calculat time b/w 'stream' and 'parallelStream' that is in last
        int sum1 = nums.stream()
                       .map(i -> i*2)
                       .mapToInt(i -> i) // it canvar a map data to Integer data
                       .sum();
        long endseq = System.currentTimeMillis();

        long startpara = System.currentTimeMillis();
        int sum2 = nums.parallelStream()
                       .map(i -> i*2)
                       .mapToInt(i -> i) // it canvar a map data to Integer data
                       .sum();
        long endpara = System.currentTimeMillis();

        // System.out.println(sum + " " + sum1 + " " + sum2);
        System.out.println(sum1 + " " + sum2);
        System.out.println("Seq : " + (endseq - startseq));
        System.out.println("Seq : " + (endpara - startpara));
    }
}
