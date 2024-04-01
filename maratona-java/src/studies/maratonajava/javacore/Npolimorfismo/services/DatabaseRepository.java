package studies.maratonajava.javacore.Npolimorfismo.services;

import studies.maratonajava.javacore.Npolimorfismo.repository.Repository;

public class DatabaseRepository implements Repository {
    @Override
    public void save() {
        System.out.println("Saving to the Database");
    }
}
