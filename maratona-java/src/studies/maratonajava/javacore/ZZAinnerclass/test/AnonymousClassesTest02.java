package studies.maratonajava.javacore.ZZAinnerclass.test;

import studies.maratonajava.javacore.Zgenerics.domain.Boat;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AnonymousClassesTest02 {
    public static void main(String[] args) {
        List<Boat> boatList = new ArrayList<>(List.of(new Boat("Speedboat"), new Boat("Canoe")));

        boatList.sort(new Comparator<Boat>() {
            @Override
            public int compare(Boat boat, Boat t1) {
                return boat.getName().compareTo(t1.getName());
            }
        });

        System.out.println(boatList);
    }
}
