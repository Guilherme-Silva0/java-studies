package studies.maratonajava.javacore.Ycolections.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArrayConvertTest01 {
    public static void main(String[] args) {
        List<Integer> numsList = new ArrayList<>();
        numsList.add(1);
        numsList.add(2);
        numsList.add(3);
        Integer[] listToArray = numsList.toArray(new Integer[0]);
        System.out.println(Arrays.toString(listToArray));
        System.out.println("-------------------");
        Integer[] numsArray = {1, 2, 3};
        List<Integer> arrayToList = Arrays.asList(numsArray);
        System.out.println(Arrays.toString(numsArray));
        System.out.println(arrayToList);
        System.out.println("-------------------");
        List<Integer> arrayToList2 = new ArrayList<>(Arrays.asList(numsArray));
        arrayToList2.add(4);
        System.out.println(arrayToList2);
    }
}
