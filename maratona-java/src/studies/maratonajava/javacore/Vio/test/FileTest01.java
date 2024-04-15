package studies.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("files/test.txt");
        try {
            if (file.exists()) {
                boolean isDelete = file.delete();
                System.out.println("Is delete " + isDelete);
            }

            boolean isCreated = file.createNewFile();
            System.out.println("Is create " + isCreated);
            System.out.println("Path " + file.getPath());
            System.out.println("Path absolute " + file.getAbsolutePath());
            System.out.println("Is directory " + file.isDirectory());
            System.out.println("Is file " + file.isFile());
            System.out.println("is hidden " + file.isHidden());
            System.out.println("Last modified " + Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()).toLocalDateTime());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
