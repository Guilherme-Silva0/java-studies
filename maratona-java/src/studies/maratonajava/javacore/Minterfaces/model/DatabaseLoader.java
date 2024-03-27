package studies.maratonajava.javacore.Minterfaces.model;

public class DatabaseLoader implements DataLoader, DataRemover {
    @Override
    public void load() {
        System.out.println("Load Database...");
    }

    @Override
    public void remove() {
        System.out.println("Remove from database...");
    }

    @Override
    public void checkPermission() {
        System.out.println("Check database permission");
    }

    public static void retrieveMaxDataSize() {
        System.out.println("Inside DatabaseLoader");
    }
}
