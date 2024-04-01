package studies.maratonajava.javacore.Npolimorfismo.test;

import studies.maratonajava.javacore.Npolimorfismo.repository.Repository;
import studies.maratonajava.javacore.Npolimorfismo.services.DatabaseRepository;
import studies.maratonajava.javacore.Npolimorfismo.services.FileRepository;
import studies.maratonajava.javacore.Npolimorfismo.services.MemoryRepository;

public class RepositoryTest {
    public static void main(String[] args) {
        Repository repository = new DatabaseRepository();
        Repository repository2 = new FileRepository();
        Repository repository3 = new MemoryRepository();
        repository.save();
        repository2.save();
        repository3.save();
    }
}
