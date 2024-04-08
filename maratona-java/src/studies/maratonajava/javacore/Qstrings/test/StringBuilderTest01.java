package studies.maratonajava.javacore.Qstrings.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String name = "Guilherme";
        name.concat(" Silva");
        System.out.println(name);

        StringBuilder name2 = new StringBuilder("Guilherme");
        name2.append(" Silva");
        name2.reverse();
        name2.reverse();
        name2.delete(0, 10);
        System.out.println(name2);
    }
}
