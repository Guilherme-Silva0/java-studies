package studies.maratonajava.javacore.Minterfaces.model;

public class FileLoader implements DataLoader {
    @Override
    public void load() {
        System.out.println("Load file data...");
    }
}
