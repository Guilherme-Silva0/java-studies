package studies.maratonajava.javacore.Oexception.exception.test;

import studies.maratonajava.javacore.Oexception.exception.model.Leitor1;
import studies.maratonajava.javacore.Oexception.exception.model.Leitor2;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
        readFile();
    }

    public static void readFile() {
        try (Leitor1 leitor1 = new Leitor1(); Leitor2 leitor2 = new Leitor2()) {

        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }

    public static void readFile2() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("test.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace(System.out);
            }
        }
    }
}
