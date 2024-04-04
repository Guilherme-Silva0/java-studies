package studies.maratonajava.javacore.Oexception.exception.model;

public class Funcionario extends Pessoa {
    @Override
    public void save() throws InvalidLoginException {
        System.out.println("Saving employee");
    }
}