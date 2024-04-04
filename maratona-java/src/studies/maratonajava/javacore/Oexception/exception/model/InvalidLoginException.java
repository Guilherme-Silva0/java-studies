package studies.maratonajava.javacore.Oexception.exception.model;

public class InvalidLoginException extends Exception {
    public InvalidLoginException() {
        super("Invalid login");
    }

    public InvalidLoginException(String message) {
        super(message);
    }
}
