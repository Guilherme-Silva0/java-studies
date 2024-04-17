package studies.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class BasicFileAttributesTest02 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("files/directory2/new.txt");
        BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);

        System.out.println("creationTime " + basicFileAttributes.creationTime());
        System.out.println("lastModifiedTime " + basicFileAttributes.lastModifiedTime());
        System.out.println("lastAccessTime " + basicFileAttributes.lastAccessTime());

        BasicFileAttributeView fileAttributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
        FileTime newModifiedTime = FileTime.fromMillis(System.currentTimeMillis());
        fileAttributeView.setTimes(basicFileAttributes.lastModifiedTime(), newModifiedTime, basicFileAttributes.creationTime());

        System.out.println();
        System.out.println("creationTime " + fileAttributeView.readAttributes().creationTime());
        System.out.println("lastModifiedTime " + fileAttributeView.readAttributes().lastModifiedTime());
        System.out.println("lastAccessTime " + fileAttributeView.readAttributes().lastAccessTime());
    }
}
