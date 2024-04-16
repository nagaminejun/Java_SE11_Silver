// 7-15
// public class C extends B {}

// public class C implements B {
//   // 7-6
//   // @Override
//   // public void sample() {
//   //   A.super.sample();
//   //   System.out.println("Java");
//   // }
//   // 正解は E 、実行結果がコンパイルエラー。間接的に継承されたインターフェイスの default メソッドをInterfaceName.super.methodName() 形式で呼び出すことはできない、というルールに該当

//   // 成功するには①
//   // @Override
//   // public void sample() {
//   //   // A.super.sample();
//   //   B.super.sample();
//   //   // super.sample();
//   //   System.out.println("Java");
//   // }

//   // 成功するには② C が A を implements (実装)します、という宣言
//   // public class C implements A { // B を A にする
//   // A.super.sample();

//   // ** extends は、クラスを継承するキーワード **
// }
