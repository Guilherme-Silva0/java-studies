package studies.maratonajava.javacore.ZZAinnerclass.test;

public class OuterClassTest03 {
  private String name = "Monkey";

  static class Nested {
    private String lastName = "D. Luffy";

    void print() {
      System.out.println(new OuterClassTest03().name + " " + lastName);
    }
  }

  public static void main(String[] args) {
    new Nested().print();
  }
}
