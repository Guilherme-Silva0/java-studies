package studies.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest02 {
    public static void main(String[] args) throws IOException {
        Path directoryPath = Paths.get("files/directory");

        if (Files.notExists(directoryPath)) {
            Path directory = Files.createDirectory(directoryPath);
            System.out.println(directory);
        }

        Path subDirectoryPath = Paths.get("files/directory/subdirectory/subdirectory2");
        Path subDirectory = Files.createDirectories(subDirectoryPath);
        System.out.println(subDirectory);

        Path filePath = Paths.get(subDirectoryPath.toString(), "test.txt");
        if (Files.notExists(filePath)) {
            Path fileCreated = Files.createFile(filePath);
            System.out.println(fileCreated);
        }

        Path source = filePath;
        Path target = Paths.get(source.getParent().toString(), "test_copy.txt");
        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
    }
}
