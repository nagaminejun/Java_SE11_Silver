// java 練習用/Sample.java のみで実行可能、コンパイル省略可能、
// StringBuilderメソッドの練習

public class Sample {
  public static void main(String... args) {
    System.out.println();
    
    // Stringクラスのインスタンスは変更不可だが、StringBuilderクラスのインスタンスは変更可能
    StringBuilder sb = new StringBuilder();
    System.out.println(sb); // 空白
    sb.append("12345");
    System.out.println(sb); // 12345
    sb.reverse();
    System.out.println(sb); // 54321
    sb.replace(0, 1, "a"); // a4321
    sb.replace(1, 2, "b"); // ab321
    // 以下はクセある、先頭ないから、置き換えではなく追加してる。
    sb.replace(0, 0, "6"); // 6ab321
    System.out.println(sb);

    int num = 1;
    System.out.println(10 + - num); // num は反転する
  }
}
