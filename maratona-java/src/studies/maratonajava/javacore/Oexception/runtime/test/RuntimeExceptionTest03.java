package studies.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        openConnection();
    }

    private static String openConnection() {
        try {
            System.out.println("Open file");
//            throw new RuntimeException("");
            System.out.println("Write file");
            return "Open connection";
        } catch (Exception e) {
            e.printStackTrace(System.out);
        } finally {
            System.out.println("Close file");
        }

        return null;
    }
}
