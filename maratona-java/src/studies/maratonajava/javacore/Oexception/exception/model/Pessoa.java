package studies.maratonajava.javacore.Oexception.exception.model;

import java.io.FileNotFoundException;

public class Pessoa {
    public void save() throws InvalidLoginException, FileNotFoundException {
        System.out.println("Saving person...");
    }
}
