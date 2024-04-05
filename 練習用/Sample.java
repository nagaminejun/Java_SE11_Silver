// java 練習用/Sample.java のみで実行可能、コンパイル省略可能、

public class Sample {
  public static void main(String... args) {
    // System.out.println();
    for (String arg : args) {
      System.out.println(arg);
    }
    // 2進数
    int binary = 0b1101; // 13 (10進数)

    // 8進数
    int octal = 017; // 15 (10進数)

    // 10進数
    int decimal = 100; // 100 (10進数)

    // 16進数
    int hex = 0x1F; // 31 (10進数)

    System.out.println("Binary: " + binary);
    System.out.println("Octal: " + octal);
    System.out.println("Decimal: " + decimal);
    System.out.println("Hex: " + hex);

    // char c = '¥u30A2'; // 教材では¥を使っているがコンパイルエラー
    char c = '\u30A2'; // chat GPT 曰く、\が適切とのこと。
    System.out.println(c);

    var message = "Hello, World!";
    System.out.println(message.getClass());
    // var number = 1000; // プリミティブ型はgetClass利用できない
    
    // Stringクラスメソッド
    String text = "aaa bbb ccc ddd 123";

    // replaceAll() 交換する 正規表現は置き換え可能
    System.out.println(text.replaceAll("aaa", "xxx")); // 結果 xxx bbb ccc ddd 123
    System.out.println(text.replaceAll("a", "xxx")); // xxxxxxxxx bbb ccc ddd 123
    System.out.println(text.replaceAll("\\d+", "456")); // aaa bbb ccc ddd 456 // 正規表現は置き換え可能

    // replace() 交換する 正規表現は置き換えられない　不可
    System.out.println(text.replace("a", "!!")); // !!!!!! bbb ccc ddd 123
    System.out.println(text.replace("aaa", "!!")); // !! bbb ccc ddd 123
    System.out.println(text.replace("\\d+", "456")); // aaa bbb ccc ddd 123 // 正規表現は置き換えられない　不可
    System.out.println(text.replace("\\d+", "456"));

    // charAt()
    System.out.println(text.charAt(0));
    // System.out.println(text2.charAt(0, 5)); // charAtは１文字を返すメソッドのため、複数文字指定は不可

    // indexOf()
    System.out.println(text.indexOf("a")); // 0
    System.out.println(text.indexOf("aaa")); // 0
    System.out.println(text.indexOf(" ")); // 3

    // substring() 指定した範囲の文字を取得する
    System.out.println(text.substring(0, 1)); // a
    System.out.println(text.substring(0, 5)); // aaa b

    // startsWith() 引数の文字が先頭で正しいか
    System.out.println(text.startsWith("a")); // true
    System.out.println(text.startsWith("b")); // false

    // endsWith() 引数の文字が末尾で正しいか
    System.out.println(text.endsWith("3")); // true
    System.out.println(text.endsWith("a")); // false

    // concat() 連結
    System.out.println(text.concat("foooooooo")); // aaa bbb ccc ddd 123foooooooo
    // null は連結不可
    String con = null;
    System.out.println(text.concat(con));
    // 結果
    // Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.isEmpty()" because "str" is null
    
    //　※※ 注意 ※※
    // append() はStringクラスではない。正しくはStringBuilderクラス、StringBufferクラスのメソッド

  }
}
