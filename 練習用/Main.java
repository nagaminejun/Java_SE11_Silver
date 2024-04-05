public class Main {
  public static void main(String[] args) {

    String s1 = new String("example"); // ヒープ上に新しいStringオブジェクトを作成
    String s2 = s1.intern(); // 文字列プールから、または文字列プールに "example" を追加
    String s3 = "example"; // 文字列リテラルは文字列プールから取得される

    System.out.println(s1 == s2); // false: s1はヒープ上のオブジェクト、s2は文字列プールのオブジェクト
    System.out.println(s2 == s3); // true: s2とs3は文字列プール内の同じオブジェクトを指す

  }
}
