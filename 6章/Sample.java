public class Sample {

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
