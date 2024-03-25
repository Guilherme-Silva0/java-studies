package studies.maratonajava.javacore.Minterfaces.model;

public class DatabaseLoader implements DataLoader {

    @Override
    public void load() {
        System.out.println("Load Database...");
    }
}
