package studies.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) {
        File directory = new File("files/directory");
        boolean isCreated = directory.mkdir();
        System.out.println(isCreated);

        File fileDirectory = new File(directory, "test.txt");
        try {
            boolean isFileCreated = fileDirectory.createNewFile();
            System.out.println(isFileCreated);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        File fileRenamed = new File(directory, "text-renamed.txt");
        boolean isRenamed = fileDirectory.renameTo(fileRenamed);
        System.out.println(isRenamed);

        File directoryRenamed = new File("files/directory-renamed");
        System.out.println(directory.renameTo(directoryRenamed));
    }
}
