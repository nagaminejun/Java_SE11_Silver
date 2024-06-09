package ex27;
import other.Book;

// 6-27
public class StoryBook extends Book {}

// Mainクラスから、StoryBookクラスのprotectedのprintInfo()メソッドを呼び出したい場合は、同パッケージにいるBookクラスで、printInfo()をオーバーライドする（定義する）。

// public class StoryBook extends other.Book {
//   @Override
//   public void printInfo() { // public にする、
//     super.printInfo(); // BookクラスのprintInfoを呼び出す
//   }
// }

// 問題とは別で、勉強になったこと、
// import other.Book;を使用しない場合は、クラス定義の部分で、パッケージ + class名で宣言する。
// 上記の方法はコードが冗長になるので、基本はimpotr宣言で。

// 試した
// package ex27;

// public class StoryBook extends other.Book {
//   @Override
//   public void printInfo() { // public にする、
//     super.printInfo(); // BookクラスのprintInfoを呼び出す
//   }
// }
