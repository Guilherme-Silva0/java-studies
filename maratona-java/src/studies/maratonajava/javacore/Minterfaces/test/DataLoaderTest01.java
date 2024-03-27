package studies.maratonajava.javacore.Minterfaces.test;

import studies.maratonajava.javacore.Minterfaces.model.DatabaseLoader;
import studies.maratonajava.javacore.Minterfaces.model.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        databaseLoader.load();
        fileLoader.load();

        databaseLoader.remove();
        fileLoader.remove();

        databaseLoader.checkPermission();
        fileLoader.checkPermission();
    }
}
