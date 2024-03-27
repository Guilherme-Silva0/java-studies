package studies.maratonajava.javacore.Minterfaces.model;

public interface DataLoader {
    //public static final
    int MAX_DATA_SIZE = 10;

    //public abstract
    void load();

    default void checkPermission() {
        System.out.println("Check permission");
    }

    static void retrieveMaxDataSize() {
        System.out.println("Inside DataLoader");
    }
}
