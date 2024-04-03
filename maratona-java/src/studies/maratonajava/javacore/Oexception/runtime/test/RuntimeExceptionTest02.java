package studies.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        try {
            System.out.println(division(1, 0));
        } catch (RuntimeException e) {
            System.err.println(e.getMessage());
        }
    }

    /**
     * @param a int
     * @param b int cannot be 0 (zero)
     * @return Division between parameter A and B
     * @throws IllegalArgumentException If B is 0
     */
    private static int division(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("The denominator cannot be 0 (zero)");
        }
        return a / b;
    }
}
