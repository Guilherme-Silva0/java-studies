package studies.maratonajava.javacore.ZZAinnerclass.test;

public class OuterClassTest02 {
    private final String name = "Midoriya";

    void print() {
        String lastName = "Izuku";
        class LocalClass {
            public void printLocal() {
                System.out.println(name + " " + lastName);
            }
        }
        new LocalClass().printLocal();
    }

    public static void main(String[] args) {
        OuterClassTest02 outer = new OuterClassTest02();
        outer.print();
    }
}
