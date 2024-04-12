public class Main {
  public static void main(String[] args) {
    System.out.println();

    // 6-17
    // Main m = new Main();
    // System.out.println(m.calc(2, 3));

    // 6-16 以下のメソッドを、オーバーロードしていないメソッドはどれ
    // int calc(double a, int b) {
    //   return (int) a + b;
    // }
    // 選択肢
    // int calc(int a) {}
    // double calc(double a, int b) {}
    // int calc(double a, double b) {}
    // int calc(double num1, int num2) {}
    // int calc() {}
    // int calc(int a, double b) {}

    // 6-15 Sampleクラスでの問題

    // 6-14 メソッドの宣言で正しいのはどれ　可変長引数
    // void method(void) {}
    // void method(int values...) {}
    // void method(int... values, String name){}
    // void method(int... a, int... b) {}
    // 結果 全て不正解
    // 正しくは
    // void method(int... values) {}

    // 試した sumメソッドはmain()外
    // System.out.println(sum(1, 2, 3)); // 出力: 6
    // System.out.println(sum(1, 2, 3, 4, 5, 6)); // 出力: 21

    // 6-13 実行結果、
    // Sample s = new Sample();
    // int result = s.method(2);
    // System.out.println(result);
    // コンパイルエラー

    // 6-12 実行結果が成功するために ??? に実装する内容は
    // ??? result = s.divide(10, 2);
    // Sample s = new Sample();
    // float result = s.divide(10, 2); // 答え１
    // double result = s.divide(10, 2); // 答え２
    // System.out.println(result);

    // 試した1
    // Sample s = new Sample();
    // int result = s.divide(1.11F, 1.22F); // Fないとdouble型として認識される。
    // System.out.println(result);

    // 試した2
    // Sample s = new Sample();
    // double result = s.divide(10.91233, 2.22);
    // System.out.println(result);

    // 6-11 実行結果は、
    // Sample s = new Sample();
    // String val = s.setValue("hello");
    // s.getValue();
    // System.out.println(val);
    // 結果、String val = s.setValue("hello");でコンパイルエラー、理由、呼び出し先メソッドが戻り値持たないvoidだから。
    /* Main.java:10: エラー: シンボルを見つけられません
    System.out.println(val);
                       ^
      シンボル:   変数 val
      場所: クラス Main
    エラー1個 */

    // 改善案
    // Sample s = new Sample();
    // s.setValue("hello"); // voidであるメソッドでは値を渡すだけにして、
    // String val = s.getValue(); // 戻り値を持つメソッドを利用して、値をMainクラスで受け取る。
    // System.out.println(val);

    // 6-10 メソッド宣言で正しいのは
    // Void sample() {}
    // void sample() { return "sample"; }
    // sample() {}
    // int sample() { return "sample"; }
    // void sample() {}


    // 6-9
    // 簡単なので省略

    // 6-8 実行結果は、
    // Sample s = new Sample();
    // System.out.println(s.add(10));
    // 結果 コンパイルエラー

    // 6-7 コンソールでhelloと表示するには
    // Sample sample = new Sample();
    // sample.hello();
    // 答え E
    // 参照先をstaticにして試した
    // Sample.hello();
    // 結果 成功

    // 6-6 DE
    // staticなメソッドからは、staticなフィールドにアクセスできる
    // staticではないメソッドからは、staticなフィールドにアクセスできる

    // 6-5 コンパイル、実行結果は、
    // Sample.num = 10;
    // Sample s = new Sample();
    // Sample s2 = new Sample();
    // s.num += 10;
    // s2.num = 30;
    // System.out.println(s.num);
    // System.out.println(s2.num);
    // System.out.println(Sample.num);
    // 結果 30 クラスフィールド（Static Field）、属性（インスタンスフィールド）を理解する

    // 試した、属性（インスタンスフィールド）
    // Sample s = new Sample();
    // Sample s2 = new Sample();
    // s.num += 10;
    // s2.num = 30;
    // System.out.println(s.num);
    // System.out.println(s2.num);

    
    // 6-4 b = null;が終了した時にガベレージコレクションの対象となるインスタンスは
    // Object a = new Object();
    // Object b = new Object();
    // Object c = a;
    // a = null;
    // b = null;
    // 答え B

    // 6-3 nullと表示するためのコードは
    // Object obj = null;
    // Object obj = false;
    // Object obj = NULL;
    // Object obj = "";
    // System.out.println(obj);
    // 答え A Object obj = null;のみ、定数に注意。

    // 補足、Object obj = NULL;で nullを出力したい場合は、定数を定義する。
    // final Object NULL = null;


    // 6-2
    // Item a = new Item();
    // Item b = new Item();
    // a.name = "apple";
    // b.price = 100;
    // a.price = 200;
    // b.name = "banana";
    // a = b;
    // a.printInfo();
    // 結果 banana, 100

    // 6-1 実行結果は
    // Item a = new Item();
    // Item b = new Item();
    // b.setNum(20);
    // System.out.println(a.getNum());
    // 結果 10

  }
  // 6-14 試した
  // 試した
  // public static int sum(int... numbers) {
  //   int total = 0;
  //   for (int number : numbers) {
  //     total += number;
  //     }
  //   return total;
  //   // System.out.println(sum(1, 2, 3)); // 出力: 6
  //   // System.out.println(sum(1, 2, 3, 4, 5, 6)); // 出力: 21
  // }

  // 6-17
  // private double calc(double a, int b) {
  //   return (a + b) / 2;
  // }

  // private double calc(int a, double b) {
  //   return (a + b) / 2;
  // }
}
