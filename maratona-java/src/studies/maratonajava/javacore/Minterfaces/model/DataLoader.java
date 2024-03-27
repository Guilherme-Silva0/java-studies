package studies.maratonajava.javacore.Minterfaces.model;

public interface DataLoader {
    //public abstract
    void load();

    default void checkPermission() {
        System.out.println("Check permission");
    }
}
