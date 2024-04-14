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
  // 答え E
  // Sample.java:7: エラー: thisの呼出しはコンストラクタの先頭文である必要があります
  //     this("B");
  //         ^
  // エラー1個

  // 出力するには以下
  // public Sample() {
  //   this("B"); // コンストラクタでのthisは先頭分である規則がある。
  //   System.out.println("A");
  // }
  // public Sample(String str) {
  //   System.out.println(str);
  // }

  // 6-24 コンソールにOK.と出力するには
  // public Sample() {
  //   // Sample(null, 0);
  //   // this(null, 0);
  //   // super(null, 0);
  //   // this.Sample(null, 0);
  // }

  // public Sample(String str, int num) {
  //   System.out.println("ok.");
  // }
  // 答え B

  // 6-23
  // public void Sample() {
  //   System.out.println("A");
  // }
  // public Sample(String str) {
  //   System.out.println(str);
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
  // public static int num;
  // {
  //   num = 10; // 初期化ブロック
  //   System.out.println(num);
  // }
  // public Sample() {
  //   num = 100;
  // }

  // 6-21
  // public Sample() {
  //   System.out.println("A");
  // }
  // {
  //   System.out.println("B");
  // }

  // 6-20
  // void Sample() {
  //   System.out.println("hello.");
  // }

  // 6-15
  // public void method(int num) {
  //   if (num < 0) return;
  //   System.out.println("A");
  //   return;
  //   System.out.println("B");
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
  // public int num = 0; // これはインスタンスフィールド、試して
}
