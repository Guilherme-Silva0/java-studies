package studies.maratonajava.javacore.Ycolections.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(4);
        nums.add(1);
        nums.add(3);
        Collections.sort(nums);
        System.out.println("List " + nums);
        System.out.println(Collections.binarySearch(nums, 2));
    }
}
