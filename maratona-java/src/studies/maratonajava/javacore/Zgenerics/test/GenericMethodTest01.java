package studies.maratonajava.javacore.Zgenerics.test;

import studies.maratonajava.javacore.Zgenerics.domain.Boat;

import java.util.ArrayList;
import java.util.List;

public class GenericMethodTest01 {
    public static void main(String[] args) {
        System.out.println(makeArrayWithAObject(new Boat("canoe")));
    }

    private static <T> List<T> makeArrayWithAObject(T object) {
        List<T> list = new ArrayList<>();
        list.add(object);
        return list;
    }

//    private static <T extends Comparable<T>> List<T> makeArrayWithAObject(T object) {
//        List<T> list = new ArrayList<>();
//        list.add(object);
//        return list;
//    }
}
