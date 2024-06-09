public class Sample {
  // System.out.println();

  // 6-29,6-30
  // public int num;
  // public Sample(int num) {
  //   this.num = num;
  // }

  // 6-28 カプセル化をするには、
  // int num;
  // int getNum() { return num;}
  // void setNum(int num) { this.num = num; }

  // 6-25
  // public Sample() {
  //   System.out.println("A");
  //   this("B");
  // }
  // public Sample(String str) {
  //   System.out.println(str);
  // }
  // 答え E 理由：初期化に反する実装
  // Sample.java:7: エラー: thisの呼出しはコンストラクタの先頭文である必要があります
  //     this("B");
  //         ^
  // エラー1個

  // 出力するには以下、理由の解説はchat GPTの履歴へ
  // public Sample() {
  //   this("B"); // コンストラクタでのthisは先頭分である規則がある。
  //   System.out.println("A");
  // }
  // public Sample(String str) {
  //   System.out.println(str);
  // }

  // 6-24 コンソールにOK.と出力するには
  // public int num = 100; // 試した

  // public Sample() {
    // Sample(null, 0); // これはメソッドで呼べる。暗黙的なthisがある
    // this(null, 0); // これが正解
    // super(null, 0);
    // this.Sample(null, 0); // これはメソッドで呼べる
    // System.out.println(this); // 試した
    // System.out.println(this.num); // 試した
  // }

  // public Sample(String str, int num) {
  //   System.out.println("コンストラクタで出力、ok.");
  // }

  // void Sample(String str, int num) { // 試したこれメソッド
  //   System.out.println("メソッドで試した");
  // }
  // 答え B

  // 試した
  // public void Sample(String str, int num) {
  //   System.out.println("一般メソッドで出力");
  // }

  // 試した
  // public void test() {
  //   System.out.println(this + " メソッド経由でthis()使って出力");
  // }

  // 6-23
  // void Sample() {
  //   System.out.println("A");
  // }
  // Sample(String str) {
  //   System.out.println(str + " コンストラクタで出力");
  // }

  // 試した
  // {
  //   System.out.println("A");
  // }
  // public Sample() {
  //   System.out.println(" コンストラクタで出力");
  // }

  // 試した
  // public void Sample() {
  //   System.out.println("A");
  // }
  // 一旦以下コンストラクタをコメントアウト
  // public Sample(String str) {
  //   System.out.println(str);
  // }

  // 6-22
  // public static int num; // 変数のデフォルト値 0
  // static { // static初期化子試した
  //   num += 10; // 初期化ブロック、インスタンス生成のタイミングで実行される
  //   System.out.println(num + "  static初期化子！");
  // }
  // {
  //   num = 10; // 初期化ブロック、インスタンス生成のタイミングで実行される
  //   System.out.println(num + "  インスタンス初期化子！");
  // }
  // public Sample() {
  //   num = 100;
  // }


  // 試した、静的初期化、staticブロックの練習
  // static {
  //   System.out.println("静的初期化ブロック");
  // }
  // {
  //   System.out.println("インスタンス初期化ブロック");
  // }
  // public Sample() {
  //   System.out.println("コンストラクタ");
  // }

  // 試した２ 静的初期化ブロックとインスタンス初期化ブロック、どちらが先か
  // {
  //   System.out.println("インスタンス初期化ブロック");
  // }
  // static {
  //   System.out.println("静的初期化ブロック");
  // }
  // public Sample() {
  //   System.out.println("コンストラクタ");
  // }
  // 結果、staticが先らしい
  // 静的初期化ブロック
  // インスタンス初期化ブロック
  // コンストラクタ
  // インスタンス初期化ブロック
  // コンストラクタ
  // インスタンス初期化ブロック
  // コンストラクタ


  // 6-21
  // public Sample() { // コンストラクタ部分
  //   System.out.println("A"); // コンストラクタ部分
  // } // コンストラクタ部分
  // { // 初期化ブロック
  //   System.out.println("B"); // 初期化ブロック
  // } // 初期化ブロック

  // 自分がわかりやすいよう改行
  // public Sample() { System.out.println("A"); } // この行がコンストラクタ部分で、
  // { System.out.println("B"); } // この行がコンストラクタの前にある初期化ブロック

  // 6-20
  // public void Sample() { // これはコンストラクタではなくメソッド
  //   System.out.println("hello.");
  // }
  // 試した
  // public Sample() {
  //   System.out.println("hello これはpublic Sample()");
  // }

  // 6-15
  // public void method(int num) {
  //   if (num < 0) return;
  //   System.out.println("A");
  //   // return;
  //   System.out.println("B"); // 到達不能な行のためコンパイルエラー
  // }
  // 結果 C System.out.println("B");がコンパイルエラー

  // 6-13
  // public int method(int a, int b) {
  //   return a + b;
  // }

  //6-12 
  // public float divide(int a, int b) {
  //   return (float) a / (float) b;
  // }

  // 試した Main側変数をint型にして 引数float
  // public int divide(float a, float b) {
  //   return (int) a / (int) b;
  // }
  // 試した Main側変数をint型にして、引数double
  // public int divide(double a, double b) { // double型で受け取り、
  //   return (int) a / (int) b; // int型へcastして返す、故に計算結果 5.0
  // }

  // 6-11
  // private String value;
  // public void setValue(String value) {
  //   this.value = value;
  // }
  // public String getValue() {
  //   return this.value;
  // }

  // 6-8
  // public int add(Integer a, Integer b) {
  //   return a + b;
  // }

  // public void hello() {
  //   System.out.println("hello");
  // }
  // staticを試した
  // public static void hello() {
  //   System.out.println("hello");
  // }
  // 結果 hello 出力成功

  // public static int num = 0;

  // public void modifyAndPrintStaticNum() {

  //   Static.setStaticNum(10);  // 静的フィールドに値を設定
  //   Static.printStaticNum();  // 静的フィールドの値を出力
  // }

  // public static void main(String[] args) {
  //     // 静的メソッドの呼び出し
  //   Static.setStaticNum(5);
  //   Static.printStaticNum();

  //   // 非静的メソッドの呼び出し
  //   Sample sample = new Sample();
  //   sample.modifyAndPrintStaticNum();
  // }

  
  // Static.staticNum = 10;

  // 6-5
  // static int num = 0; // 教材では左記で記述あるがエラー。
  // public static int num = 0;
  // int num2 = 0;
}
