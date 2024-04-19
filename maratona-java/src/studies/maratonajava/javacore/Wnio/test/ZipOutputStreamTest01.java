package studies.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutputStreamTest01 {
    public static void main(String[] args) throws IOException {
        Path fileZip = Paths.get("files/file.zip");
        Path filesToZip = Paths.get("files/subpasta1/subsubpasta1");

        Files.deleteIfExists(fileZip);

        zip(fileZip, filesToZip);
    }

    private static void zip(Path fileZip, Path filesToZip) {
        try (
                ZipOutputStream zipStream = new ZipOutputStream(Files.newOutputStream(fileZip));
                DirectoryStream<Path> directoryStream = Files.newDirectoryStream(filesToZip);
        ) {
            for (Path file : directoryStream) {
                ZipEntry zipEntry = new ZipEntry(file.getFileName().toString());
                zipStream.putNextEntry(zipEntry);
                Files.copy(file, zipStream);
                zipStream.closeEntry();
            }
            System.out.println("Success");
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
    }
}
