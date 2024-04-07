package studies.maratonajava.javacore.Qstrings.test;

public class StringPerfomanceTest01 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        concatString(30000);
        long end = System.currentTimeMillis();
        System.out.println("\"concatString\" function execution time: " + (end - start) + "ms");

        start = System.currentTimeMillis();
        concatStringBuilder(1000000);
        end = System.currentTimeMillis();
        System.out.println("\"concatStringBuilder\" function execution time: " + (end - start) + "ms");

        start = System.currentTimeMillis();
        concatStringBuffer(1000000);
        end = System.currentTimeMillis();
        System.out.println("\"concatStringBuffer\" function execution time: " + (end - start) + "ms");
    }

    private static void concatString(int len) {
        String text = "";
        for (int i = 0; i < len; i++) {
            text += i;
        }
    }

    private static void concatStringBuilder(int len) {
        StringBuilder text = new StringBuilder(len);
        for (int i = 0; i < len; i++) {
            text.append(i);
        }
    }

    private static void concatStringBuffer(int len) {
        StringBuffer text = new StringBuffer(len);
        for (int i = 0; i < len; i++) {
            text.append(i);
        }
    }
}
