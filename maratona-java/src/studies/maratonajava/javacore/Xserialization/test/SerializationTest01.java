package studies.maratonajava.javacore.Xserialization.test;

import studies.maratonajava.javacore.Xserialization.domain.Student;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializationTest01 {
    public static void main(String[] args) {
        Student student = new Student(1L, "Guilherme Silva", "show");
        save(student);
        System.out.println(read());
    }

    private static void save(Student student) {
        Path path = Paths.get("files/students.ser");
        try (
                ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))
        ) {
            oos.writeObject(student);
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
    }

    private static Student read() {
        Path path = Paths.get("files/students.ser");
        try (
                ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))
        ) {
            return (Student) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace(System.out);
            return null;
        }
    }
}
