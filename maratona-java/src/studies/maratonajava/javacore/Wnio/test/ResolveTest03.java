package studies.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolveTest03 {
    public static void main(String[] args) {
        Path direcroty = Paths.get("files/gui");
        Path file = Paths.get("dev/test.txt");
        Path resolve = direcroty.resolve(file);
        System.out.println(resolve);
    }
}
