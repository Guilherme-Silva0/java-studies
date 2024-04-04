package studies.maratonajava.javacore.Oexception.runtime.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Inside of ArrayIndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Inside of IndexOutOfBoundsException");
        } catch (IllegalArgumentException e) {
            System.out.println("Inside of IllegalArgumentException");
        } catch (ArithmeticException e) {
            System.out.println("Inside of ArithmeticException");
        } catch (RuntimeException e) {
            System.out.println("Inside of RuntimeException");
        } catch (Exception e) {
            System.out.println("Inside of Exception");
        }

        try {
            maybeThrowException();
        } catch (SQLException | FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void maybeThrowException() throws SQLException, FileNotFoundException {
    }
}
