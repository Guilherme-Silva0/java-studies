package studies.maratonajava.javacore.Oexception.exception.test;

import studies.maratonajava.javacore.Oexception.exception.model.Funcionario;
import studies.maratonajava.javacore.Oexception.exception.model.InvalidLoginException;
import studies.maratonajava.javacore.Oexception.exception.model.Pessoa;

import java.io.FileNotFoundException;

public class OverwrittenExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.save();
        } catch (InvalidLoginException e) {
            System.err.println(e.getMessage());
        }

        try {
            pessoa.save();
        } catch (InvalidLoginException e) {
            System.err.println(e.getMessage());
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }
    }
}
