package studies.maratonajava.javacore.Zgenerics.test;

import java.util.List;

public class WildcardTest02 {
    public static void main(String[] args) {
        List<Dog> dogs = List.of(new Dog(), new Dog());
        List<Cat> cats = List.of(new Cat(), new Cat());
    }

    private static void printConsult(List<Animal> animals) {
        for (Animal animal : animals) {
            animal.consult();
        }
    }
}
