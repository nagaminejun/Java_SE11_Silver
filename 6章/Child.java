// package other;
// import ex26.Parent;
// package chapter6;


// // 6-26
// public class Child extends Parent {
//   public static void main(String[] args) {
//     Child child = new Child();
//     System.out.println(num);
//   }
// }
// 結果  ラー: staticでない変数 numをstaticコンテキストから参照することはできません
//     System.out.println(num);
//                        ^
// エラー1個

// public class Child extends Parent {
//   public static void main(String[] args) {
//     Child child = new Child();
//     System.out.println(Parent.num);
//   }
// }
// ※  実行コマンドは java Child
// java Child.java だとエラー 理由：chat GPT履歴へ
// 結果、10

// public class Child extends Parent {
//   public void main(String[] args) {
//     Child child = new Child();
//     System.out.println(Parent.num);
//   }
// }
// 結果、出力が空欄


// Parentクラスのnumの修飾子を変えても上記ではエラーです。解消するには下記、staticを削除し、インスタンスから呼び出す
// public class Child extends Parent {
//   public void main(String[] args) {
//     Child child = new Child();
//     System.out.println(child.num);
//   }
// }
