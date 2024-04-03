package studies.maratonajava.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {
    public static void main(String[] args) throws IOException {
        createNewFile();
    }

    private static void createNewFile() throws IOException {
        File file = new File("files/test.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("was raised? " + isCreated);
        } catch (IOException e) {
            e.printStackTrace(System.out);
            throw e;
        }
    }
}
