package studies.maratonajava.javacore.Minterfaces.model;

public class FileLoader implements DataLoader, DataRemover {
    @Override
    public void load() {
        System.out.println("Load file data...");
    }

    @Override
    public void remove() {
        System.out.println("Remove file data...");
    }

    @Override
    public void checkPermission() {
        System.out.println("Check file permission");
    }
}
