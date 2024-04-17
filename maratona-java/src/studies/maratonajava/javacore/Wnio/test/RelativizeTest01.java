package studies.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest01 {
    public static void main(String[] args) {
        Path directory = Paths.get("/files/gui");
        Path file = Paths.get("/files/gui/dev/test.txt");
        Path relativize = directory.relativize(file);
        System.out.println(relativize);
    }
}
