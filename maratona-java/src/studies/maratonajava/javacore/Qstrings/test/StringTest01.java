package studies.maratonajava.javacore.Qstrings.test;

public class StringTest01 {
    public static void main(String[] args) {
        String name = "Jhon"; // String constant pool
        String name2 = "Jhon";

        name = name.concat(" Joe");

        // Use when you want to compare the reference in memory.
        System.out.println(name == name2);

        String name3 = new String("Jhon");
        System.out.println(name2 == name3);
        System.out.println(name2 == name3.intern());
    }
}
