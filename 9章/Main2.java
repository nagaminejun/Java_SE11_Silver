package forEachTest;

import java.util.List;
import java.util.function.Consumer;

public class Main2 {
  public static void main(String[] args) {
    List<String> list = List.of("A", "B", "C");
    Consumer<String> logic = forEachTest.Main2::test;
    list.forEach(logic);
  }
  public static void test(String str) {
    System.out.println(str);
  }
}
