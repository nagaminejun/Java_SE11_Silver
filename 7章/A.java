// 7-20
// public class A {
//   public A() {
//     System.out.println("A");
//   }
// }

// 7-19 thisを理解するために
// public class A {
//   int num = 10;

//   public void printNum() {
//     System.out.println("Number in A: " + this.num);
//     System.out.println(this);
//   }
// }

// 7-17
public class A {
  public void hello() {
    System.out.println("A");
  }

  // public void upcast() {
  //   System.out.println("A でupcastメソッド");
  // }
}

// 7-16
// public class A {}

// 7-15
// public interface A  {}

// 7-12
// public class A {

//   public String val = "A";
//   public void print() {
//     System.out.print(val);
//   }

//   // A b = new B();のアップキャストを理解するために
//   public void methodA() {
//     System.out.println("Method in A");
//   }
// }

//   public void methodC() {
//     System.out.println("Method in C !!");
//   }
// }






// public interface A {

// //   // 7-11
// //   // String val = "A";
// //   // void print() {
// //   //   System.out.println(val);
// //   // }
// //   // 7-7
//   // default void test() {
//   //   System.out.println("A");
//   // }
 

// //   // 7-6
// //   // default void sample() {
// //   //   System.out.println("Hello");
// //   // }

// //   // 7-5
// //   // @Override
// //   // default String toString() {
// //     // return "A";
// //   // }
// //   // toString()メソッドは、Java.lang.Objectクラスに定義されているメソッド
// //   // 正しくは以下のように定義のみ
// //   // default String toString();
// //   // ※ {}があるだけでも、実装と認識されるのでエラー

// // 試した 同じエラーになる
// // @Override
// // default String toString() {}
// // }

// //   // 試した、独自メソッド
// //   // @Override // この記述はエラーになる
// //   // A.java:24: エラー: メソッドはスーパータイプのメソッドをオーバーライドまたは実装しません
// //   // @Override
// //   // ^
// //   // default String toString2() {
// //   //   return "A";
// //   // }


// //   // 7-4
//   // void sample() { // defalut 修飾子要す
//   //   System.out.println("sample");
//   // }
//   // 答え java8から導入された default 修飾子が必要
//   // 答えを試す
//   // default void sample() {
//   //   System.out.println("sample");
//   // }
// }
