// mainメソッドのブロック外部にenum Day定義あり。最下部に
public class Main {
  public static void main(String[] args) {
    System.out.println();


    // 3-21
    // int num = 1;
    // switch (num) {
    //   case 1:
    //   case 2:
    //   case 3: System.out.println("A");
    //   case 4: System.out.println("B");
    //   default:
    //     System.out.println("C");
    // }
    // 結果　ABC
    // 解説　break;がないため、caseに該当した場合、以降記述の処理が実行される。breakするまで。
    // break;ありは下記
    // int num = 2;
    // switch (num) {
    //   case 1:
    //     break;
    //   case 2:
    //     break;
    //   case 3: System.out.println("A");
    //     break;
    //   case 4: System.out.println("B");
    //     break;
    //   default:
    //     System.out.println("C");
    // }

    // 3-20 コンパイルエラーはどれ？
    // final int NUM = 0;
    // int num = 10;
    // int num1 = 10;
    // switch (num) {
    //   case "10":
    //     System.out.println("A");
    //     break;
    //   case num:
    //     System.out.println("B");
    //     break;
    //   case 2 * 5:
    //     System.out.println("C");
    //     break;
    //   case NUM:
    //     System.out.println("D");
    //     break;
    //   case num1:
    //     System.out.println("java");
    //     break;
    // }
    // 答え case "10":とcase num:
    // 解説：switch引数のnumはint型であり、case値も型を合わせる必要ある。
    // 重要：「case値に変数は使用不可。」
    // Main.java:11: エラー: 不適合な型: Stringをintに変換できません:
    //   case "10":
    //        ^
    // Main.java:14: エラー: 定数式が必要です
    //       case num:
    //           ^
    // Main.java:23: エラー: 定数式が必要です
    //       case num1:
    //           ^
    // エラー3個

    // System.out.println(Day.values()); // enumが理解できない

    // 3-19 switch文の戻り値
    
    // int number = 1;

    // switch (number) {
    //   case 1:
    //     System.out.println("1が入力");
    //     break;
    //   case 2:
    //     System.out.println("2が入力");
    //     break;
    //   case 3:
    //     System.out.println("3が入力。");
    //     break;
    //   default:
    //     System.out.println("1~3以外が入力");
    //   }
      // long型:エラー: 整数が大きすぎます。
      // double型 不適合な型: 精度が失われる可能性があるdoubleからintへの変換
      // float型 不適合な型: 精度が失われる可能性があるfloatからintへの変換 case 1.111F:
      // boolean型 不適合な型: booleanをintに変換できません:
    
    // 試した switch文の戻り値で指定できない型
    // long型、double型、float型、boolean型

    // long myLong = 10L;
    // switch(myLong) {
    //   case 10L:
    //     System.out.println("Long型");
    // }
    // 結果
    // java 3章/Main.java
    // 3章/Main.java:95: エラー: selector type long is not allowed
    //     switch(myLong) {
    //           ^

    // double mydouble = 10.0;
    // switch(mydouble) {
    //   case 10.0:
    //     System.out.println("mydouble型");
    // }
    // 結果
    // 3章/Main.java:101: エラー: selector type double is not allowed
    // switch(mydouble) {
    //       ^

    // float myFloat = 10.0F;
    // switch(myFloat) {
    //   case 10.0F:
    //     System.out.println("myFloat型");
    // }
    // 結果
    // 3章/Main.java:107: エラー: selector type float is not allowed
    // switch(myFloat) {
    //       ^

    // boolean myBoolean = true;
    // switch(myBoolean) {
    //   case true:
    //     System.out.println("myBoolean型");
    // }
    // 結果
    // 3章/Main.java:126: エラー: selector type boolean is not allowed
    // switch(myBoolean) {
    //       ^


    // 3-18
    // int num = 10;
    // if (num == 100)
    //   System.out.println("A");
    // else if (10 < num)
    //   System.out.println("B");
    // else // 段落が気になる。。。
    // if (num == 10)
    //   System.out.println("C");
    // else
    // if (num == 10)
    //   System.out.println("D");
    // 結果 C 条件に合致したら、それ以降は処理実行されない。

    // 3-17
    // int num = 10;
    // if (num < 10) // num は10未満か？
    //   System.out.println("A");
    // else
    //   System.out.println("B");
    // if (num == 10)
    //   System.out.println("C");

    // 3-16
    // if (false)
    // System.out.println("A");
    // System.out.println("B");
    // 結果 B
    // 解説 中かっこ{}を省略した実装だが、B部分は省略されていない。省略を戻すと以下のコードになる。
    // if (false) {
    //     System.out.println("A");
    // }
    // System.out.println("B");

    // 試した
    // if (true)
    // System.out.println("A");
    // System.out.println("B");
    // AB


    // 3-15
    // int num = 10;
    // if (num <= 10) // 正解
    // if num <= 10
    // if (num <= 10) then // javaで thenキーワードは、、、
    // if num <= 10 then
    // System.out.println("ok");

    // 3-14 internメソッド
    // String a = "abc";
    // String b = new String(a);
    // int count = 0;
    // System.out.println(a.intern()); // 試した abc
    // System.out.println(b); // 試した abc
    // System.out.println(a == b); // 試した false
    // System.out.println(a.intern() == b); // 試した false
    // System.out.println(a.intern() == b.intern()); // 試した true
    // if (a.intern() == "abc") {
    //   count++;
    // }
    // System.out.println(b == "abc"); // abc
    // if (b == "abc") {
    //   count++;
    // }
    // // System.out.println(a.intern() == b.intern()); true
    // if (a.intern() == b.intern()) {
    //   count++;
    // }
    // System.out.println(count); // 結果 3
    
    // // 試した
    // String str1 = new String("java");
    // String str2 = new String("java");
    // System.out.println(str1 == str2); // 結果 false
    // System.out.println(str1.intern() == str2.intern()); // 結果 true internメソッドがメモリ内の文字列("java")を参照しているから。str1やstr2のオブジェクトではない。

    // 3-13 コンスタントプール、文字列プール
    String a = new String("sample");
    String b = "sample";
    String c = new String("sample");
    System.out.print(a == c);
    System.out.print(", ");
    System.out.print(a.equals(c));
    System.out.print(", ");
    // 結果 false, true,

    // // 試した
    // String c = "sample"; // new がない所ポイント
    // String d = "sample";
    // System.out.print(c == d);// JVMが同じリテラル文字列を参照。代入時点で一つのオブジェクトを参照するため、true
    // System.out.print(", ");
    // System.out.print(c.equals(d));
    // // 結果 true, true
    // // 試した
    // int e = 1;
    // int f = 1;
    // System.out.print(e == f); // true
    // System.out.print(", ");
    // //System.out.print(e.equals(f)); //プリミティブ型はequals() メソッドが定義されていません。結果コンパイルエラー
    // System.out.print(", ");

    // 3-12 コンスタントプール、文字列プール
    // String a = "sample";
    // String b = "sample";
    // System.out.print(a == b);
    // System.out.print(", ");
    // System.out.print(a.equals(b));
    // System.out.print(", ");
    // 結果 true, true,

    // 試した
    // System.out.println(a);
    // System.out.println(b);
    // sample sample

    // 3-11
    // Object a = new Object();
    // Object b = null;
    // System.out.println(a.equals(b));

    // 以下を試した
    // Object a = new Object();
    // Object b = "";
    // System.out.println(a.equals(b)); // false

    // System.out.println(a);
    // System.out.println(b);
    // System.out.println(a.length());

    // Sample a = new Object();
    // Sample b = new Object();
    // System.out.println(a.equals(b));
    // 結果
    // nagaminejun@nagaminejunnoMacBook-Air 3章 % javac Main.java
    // Main.java:10: エラー: 不適合な型: ObjectをSampleに変換できません:
    //     Sample a = new Object();
    //                ^
    // Main.java:11: エラー: 不適合な型: ObjectをSampleに変換できません:
    //     Sample b = new Object();
    //                ^
    // エラー2個

    // 3-10 オーバーロード
    // Objcet a = new Sample(10);
    // Objcet b = new Sample(10);
    // // 3-9のような処理を求めるなら、以下ではオーバーライドされたequalsメソッドを受け取りたいが、、、
    // System.out.println(a.equals(b)); // 

    /* 解説 SampleクラスでequalsメソッドがSample型へオーバーロードされているが、mainメソッドではObject型のaをインスタンス化しているため、「Objectクラスのequalsメソッド（等価性）」が呼び出される。等値ではない。試しに、Sample a に修正すると、結果はtrueになる。*/

    // オーバーロードされたequalsメソッドを受け取る場合は以下
    // Sample a = new Sample(10);
    // Sample b = new Sample(10);
    // // インスタンス化でSample型を指定しているので、以下のa.equals(b)では、Sampleクラスのメソッドが呼び出される。
    // System.out.println(a.equals(b));
    /* さらに勉強になる点
    もし、Sampleクラスにequalsメソッドが未定義、オーバーライド、ロード未定義なら、デフォルトでObjectクラスのequalsメソッド（同一性と等価性のみ）が呼び出さ、falseになる。試してみて */

    // 3-9 equalsメソッドのオーバーライド
    // Sample a = new Sample(10, "a");
    // Sample b = new Sample(10, "b");
    // System.out.println((a == b) + " (a == b)の結果");
    // System.out.print((a.equals(b)) + " (a.equals(b)の結果");
    // equalsメソッドのデフォルトでは、this.equals(obj)

    // 試した
    // Sample a = new Sample(10);
    // Sample b = new Sample(10);
    // System.out.println((a == b) + " (a == b)の結果");
    // System.out.println((a.equals(b)) + " (a.equals(b)の結果");

    // int aa = 1;
    // int bb = 1;
    // System.out.println(aa == bb);

    // 3-8 
    // 適切なディレクトリで実行して。
    // Sample s1 = new Sample(10); //Sample@6b95977
    // Sample s2 = s1; // Sample@7344699f
    // String a1 = "10";
    // String a2 = "10";
    // s1 = new Sample(10); // 新規オブジェクトです。最初の行とは別オブジェクト Sample@7344699f
    // System.out.println(s1.toString());
    // System.out.println(s2);
    // System.out.println(s1 == s2);
    // // 試した
    // System.out.println(s1.equals(s2));
    // System.out.println(a1 == a2);
    // System.out.println(a1.equals(a2));

    // 3-7
    // int a = 100, b = 20, c = 30;
    // System.out.println(a % b); // 0
    // System.out.println(a % b * c); // 0
    // System.out.println(a % b * c + a); // 100
    // System.out.println(a % b * c + a / b); // 5

    // 3-6
    // int a = 10;
    // int b = 10;
    // System.out.println(10 < a); // false
    // System.out.println(10 <= a); // true
    // if (10 < a && 10 < ++b) {
    //   a++;
    // }
    // System.out.println(a + b);

    // 3-5
    // boolean a = true;
    // boolean b = true;
    // System.out.println(a <= b); // コンパイルエラー

    // 3-4
    // int a = 10;
    // int b = a++ + a + a-- - a-- + ++a;
    // System.out.println(b); // 32 
    // 前置き（++a）と後置き（a--）がポイント。+ a-- なら、aを足すことから始めて、それから-1する。
    // ↓ これ癖あるので見て
    // int c = 10;
    // int d = c++; // 10が変数dに代入された後、cの値に+1されてcは11になる。
    // System.out.println(d); // 結果10 ?!
    // System.out.println(c); // 結果11 ?!
    // int e = 10;
    // int f = ++e; //
    // System.out.println(f); // 結果 11
    // System.out.println(e); // 結果 11

    // 計算練習用
    // int b = a++; // 10
    // int b = a++ + a; // 21
    // int b = a++ + a + a--; // 32
    // int b = a++ + a + a-- - a--; // 22
    // int b = a++ + a + a-- - a-- + ++a; // 32
    // System.out.println(b);
    // System.out.println(a);
    // System.out.println(a++);
    // System.out.println(a);
    // System.out.println(a++ + a);

    // 試した
    // System.out.println(a);
    // int b = a++ + a; // 21 後置き評価後は 10 + 11 になる。a++は10の評価決定後に、++で11になる。右辺のaへ移動すると、値が++されているので、11となる。
    // 以下だとわかりやすい
    // int b = ++a + a; // 22 前置き評価ですぐ11になり、右辺も11になる。
    // System.out.println(b);
    // int b = a++ + a + a--; 
    // System.out.println(a);
    // System.out.println(b);
    // System.out.println(a);


    // 3-3 コンパイルエラーはどれ
    // byte a = 0b10000000;  // × byte型は-128~127まで
    // short b = 111 + 111; // short型は-32768 ~ 32767
    // int c = 2 * 3L; // × int型をlong型へ変換不可
    // float d = 10.0; // × double型（15桁）をfloat型（6桁）へ変換不可
    // System.out.println(0b10000000);
    
    // 3-2
    // int num = -10;
    // System.out.println(10 * -num); // 100
    // num = -num;
    // System.out.println(num); // 10
    // System.out.println(-num);// -10

    // 3-1
    // int a = 3;
    // System.out.println(a);
    // int b = a += 5; // a = a + 5; 結果8 慣れるまでは書いた方がいい
    // System.out.println(b); // 8
    // System.out.println(a + b); // 16
    // 解説

    // Object a = new Object();
    // Object b = null;
    // System.out.println(a);
  }
  // public enum Day {
  //   MONDAY,
  //   TUESDAY,
  //   WEDNESDAY,
  //   THURSDAY,
  //   FRIDAY,
  //   SATURDAY,
  //   SUNDAY
  // }
}
