package studies.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main (String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int age = 19; // 4 bytes
        long largeNumber = 100000; // 8 bytes
        double wageDouble = 2000; // 8 bytes
        float wageFloat = 2500; // 4 bytes
        byte ageByte = 10; // 1 byte
        short ageShort = 10; // 2 bytes
        boolean trueVar = true; // 1 bit true or false
        boolean falseVar = false; // 1 bit true or false
        char character = 'M'; // 2 bytes

        System.out.println("Age is " + age + " years");
        System.out.println(trueVar);
        System.out.println(character);
    }
}
