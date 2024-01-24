package studies.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main (String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int age = 2147483647; // 4 bytes
        long largeNumber = 2147483647; // 8 bytes
        double wageDouble = 2000.0d; // 8 bytes
        float wageFloat = 2500.0f; // 4 bytes
        byte ageByte = 127; // 1 byte
        short ageShort = 32767; // 2 bytes
        boolean trueVar = true; // 1 bit true or false
        boolean falseVar = false; // 1 bit true or false
        char character = 'M'; // 2 bytes

        String text = "This is a biiiiiiiiiiiiiiiiig text";

        short castingNumber = (short) 10000000L; //Casting

        System.out.println("Age is " + age + " years");
        System.out.println(trueVar);
        System.out.println(character);
        System.out.println(castingNumber);
        System.out.println(text);
    }
}
