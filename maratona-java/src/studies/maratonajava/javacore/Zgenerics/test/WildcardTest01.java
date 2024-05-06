package studies.maratonajava.javacore.Zgenerics.test;

abstract class Animal {
    public abstract void consult();
}

class Dog extends Animal {
    @Override
    public void consult() {
        System.out.println("Consulting the puppy");
    }
}

class Cat extends Animal {
    @Override
    public void consult() {
        System.out.println("Consulting the kitten");
    }
}

public class WildcardTest01 {
    public static void main(String[] args) {
        Dog[] dogs = {new Dog(), new Dog()};
        Cat[] cats = {new Cat(), new Cat()};

        printConsult(dogs);
        System.out.println("------------------");
        printConsult(cats);
    }

    private static void printConsult(Animal[] animals) {
        for (Animal animal : animals) {
            animal.consult();
        }
    }
}
