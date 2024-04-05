public class Main {
  public static void main(String[] args) {

    // 2-21
    // StringBuilder sb = new StringBuilder();
    // sb.append("abcde");
    // sb.reverse(); // 結果 edcba
    // sb.replace(1, 3, "a"); // 1と3をaに交換する
    // System.out.println(sb); // eaba

    // String sb = new String();
    // sb.append("abcde");
    // sb.reverse(); // 結果 edcba
    // sb.replace(1, 3, "a"); // 1と3をaに交換する
    // System.out.println(sb); // eaba


    // 2-20
    // StringBuilder sb = new StringBuilder("abcde");
    // System.out.println(sb.length());
    // System.out.println(sb.capacity());

    // 2-19
    // String str = null;
    // System.out.println(str);
    // System.out.println(str.length()); // 結果エラー、この時点では文字列ではない
    // str += "null";
    // System.out.println(str);// 結果 nullnullの文字列に変換される

    // 2-18 左から処理して、"10"
    // String str = 10 + 10 + "10" + 10;
    // System.out.println(str);
    // String str1 ="10" + 10 + 10 + 10;
    // System.out.println(str1);

    // 2-17
    // String str = "Hello, ".concat("Java!");// ◯
    // String str = "Hello, ".append("Java!");
    // String str = "Hello, ".add("Java!");
    // String str = "Hello, ".plus("Java!");
    // System.out.println(str);

    // 2-16
    // String str = "abcde";
    // System.out.println(str. substring(1, 3));// 結果はbc
    // System.out.println(str. substring(1, 3).startsWith("b"));// 結果 true startsの末尾注意s

    // 2-15
    // String str = "abcde";
    // System.out.println(str.length());// 文字列長さは5、charAtは0から指定だから、、
    // System.out.println(charAt(str.length()));
    // 結果　例外スロー
    // Exception in thread "main" java.lang.StringIndexOutOfBoundsException: Index 5 out of bounds for length 5


    // 2-14
    // String str = "aaaa";
    // System.out.println(str.replace("aa", "b"));
    // 結果　bb

    // 2-13
    // String str = "abcde";
    // System.out.println(str.substring(0, 0)); // 結果 なし
    // System.out.println(str.substring(0, 1)); // 結果 a
    // System.out.println(str.substring(0, 2)); // 結果 ab
    // System.out.println(str.substring(0, 3)); // 結果 abc
    // System.out.println(str.substring(0, 4)); // 結果 abcd
    // System.out.println(str.substring(0)); // 結果 abcde
    // System.out.println(str.substring(2, 4)); // 結果 cd

    // 2-12 indexOfメソッド
    // String str = "abcde";
    // System.out.println(str.indexOf("abcdef")); // fがポイント
    // 結果、-1 理由：調査対象の文字列なければ-1を返す。
    // System.out.println(str.indexOf("cd")); // 結果 2

    // 2-11 charAt チャーアットメソッド
    // String str = "abcde";
    // System.out.println(str.charAt(5)); // 引数は０から
    // 結果 コンパイルは成功するよ！実行時エラー発生！
    // Exception in thread "main" java.lang.StringIndexOutOfBoundsException: Index 5 out of bounds for length 5


    // これは、replaceAllの練習
    // String originalString = "apple banana apple orange";
    // // "apple"という文字列を"hoge"で置換する
    // String replacedString = originalString.replaceAll("apple", "hoge");
    // // 置換後の文字列を出力

    // System.out.println(originalString);
    // System.out.println(replacedString);
    // nagaminejun@nagaminejunnoMacBook-Air 2章 % java Main      
    // hoge banana hoge orange

    // 2-10 Stringオブジェクトは不変
    // privateメソッドは最下部へ
    // String str = "hoge, world.";
    // hello(str); // helloメソッド(voidではない)で新規作成されたオブジェクトを受け取り、下記で出力するには「再代入処理」が必要。例：str = hello(str);
    //  // str = hello(str);
    // System.out.println(str);

    // 試した、もしhello, world.の出力に変えたい場合は、privateメソッドの２を試す
    // String str2 = "hoge, world.";
    // str2 = hello(str2);
    // System.out.println(str2);

    // 2-9 valueOfメソッドの使い方覚えて
    // String c = String.newInstance('a'); // 
    // String b = "sample";
    // // String d = String.valueOf('sample');
    // String e = String.valueOf(12345); // 文字列へ変換
    // System.out.println(e + 1);
    // char[] chars = {'h', 'e', 'l', 'l', 'o'};
    // String f = String.valueOf(chars);
    // System.out.println(f);


    // 2-8
    // var a = new B();
    // a = new C();
    // a.test();
    // 結果
    // 2章/Main.java:103: エラー: 不適合な型: CをBに変換できません:
    //     a = new C();
    //         ^
    // エラー1個

    // 2-7
    // var name = "";
    // var price = 0;

    // 2-1
    // int val = 7;
    // bool flg = true;
    // if (flg == true) {
    //   do {
    //     System.out.println(val);
    //   } while (val > 10);
    // }

    // 2-2
    // int a = 111;
    // int b = 0423;
    // int c = 0x10B;
    // int d = 0b10000100;
    // int e = 08;
    // System.out.println(a);
    // System.out.println(b);
    // System.out.println(c);
    // System.out.println(d);
    // System.out.println(e);
    // 提供されたコードのうち、変数「e」に代入されている「08」は、Javaでは不正な表記です。これは8進数の表記を意図しているようですが、Javaでは8進数の場合、数字の前に「0」を付けますが、その次に「8」や「9」のような数字を使用することはできません。正しい8進数の表記は「0」から「7」までの数字を使用する必要があります。したがって、「08」は不正な8進数として認識され、エラーとなります。
    // Javaでは、整数リテラルを記述する際に、以下のプレフィックスを使用して、異なる進数で表される数値を指定することができます。
    // 10進数: 何もプレフィックスが必要ありません。
    // 8進数: 「0」で始まります。
    // 16進数: 「0x」で始まります。
    // 2進数: 「0b」で始まります。

    // 2-3 アンダースコアのルール覚えて
    // int a = 123_456_789;
    // int b = 5______2;
    // int c = _123_456_789; // ×
    // int d = 123_456_789_; // ×
    // float e = 3_.1415F; // ×
    // int f = 999_99_999L; // ×
    // byte g = 0b0_1;
    // int h = 0.52;
    // int i = 0x_52; // ×

    // 2-4 コンパイルエラーになるものは？
    // char a = "a";// ×
    // char b = 'abc';// ×
    // char c = 89; //エラーなし
    // char c = "89"; // ×
    // char d = null;// ×
    // System.out.println(c); //出力結果 Y 理由:Unicodeの値89

    // 試した
    // char e = 'a'; //
    // char f = '\u0061'; // Unicodeも可能
    // char g = 65536; × // 65535までならコンパイル可能、それ以上は不可
    // System.out.println(f);

    // 2-5 コンパイルエラーになるものは？
    // int $a = 100;
    // int b_ = 200;
    // int _0 = 300;
    // int ${d} = 400; ×
    // int g.a = 700; ×

    // int a1 = 10;
    // int 1a = 10; ×
    // int ¥ = 11;
    // int $d = 22;
    // inta _ = 11; // ×
    // int int = 11; // ×
    // int ¥.a = 11; // ×
    // int ¥() = 11; // ×
    // int ¥{} = 11; // ×

    // System.out.println($);

    // 2-6 コンパイルエラーにならないものは？
    // var a;
    // var b = null;
    // var c = () -> {};
    // var d = {1, 2, 3}; // 適切な記述例は var d = new int[]{1, 2, 3}; 配列型の明示必要
    // var f = new ArrayList<>(); // <>がなければ、コンパイラがObject型をダイヤモンド演算子<>に代入する new ArrayList<Object>()

    // 試した
    // var a = 1;
    
  }
  // 2-10 
  private static void hello(String msg) {
    msg.replaceAll("hoge", "hello"); // ここで代入処理をしないと、書き換えられたオブジェクトを参照できない。例：msg = msg.replaceAll("hoge", "hello");
    System.out.println(msg); // 再代入処理がされているなら、出力はhello, world.
    // ここではmagという新規オブジェクトが生成されているが、再代入処理されていないため、結果はhoge, world.
  }

  // 2-10 試した①
  // private static String hello(String msg) { // void(戻り値を返す)を削除、メソッドの型指定も追加
  //   return msg.replaceAll("hoge", "hello"); // return文も必要、
  // }

  // 2-10 試した② メソッド内の新しいオブジェクトは、修正された文字列を表示できる。
  // private static void hello(String msg) {
  //   String msg2 =  msg.replaceAll("hoge", "hello");
  //   System.out.println(msg2);
  //   // 結果、hello, world.
  // }
}
