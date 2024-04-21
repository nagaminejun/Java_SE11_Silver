// 7-20
// public class B extends A {
//   public B() {
//     System.out.println("B");
//   }
// }


// 7-19 thisを理解するために
// public class B extends A {
//   int num = 20;

//   public void printNum() {
//     super.printNum();
//     System.out.println("Number in B: " + this.num);
//     System.out.println(this);
//   }
// }


// 7-17
public class B extends A {
  public void hello() {
    // super.hello();
    System.out.println("B");
  }

  // public void test() {
  //   System.out.println("B でtest");
  // }
}

// 7-16
// public class B extends A {
//   public void hello() {
//     System.out.println("Hello B");
//   }
// }

// 7-15
// public class B implements A {}

// 7-11
// public class B extends A {
//   public String val = "B";

//   // A b = new B();のアップキャストを理解するために
//   public void methodB() {
//     System.out.println("Method in B");
//   }

//   @Override
//   public void methodA() {
//     System.out.println("Overridden method in B");
//   }
// }
// public interface B extends A {

//   // 7-6
//   // 試した Interfacename.super.sample();を成功させるには
//   // @Override
//   // default void sample() {
//   //   A.super.sample();
//   // } 
//   /* この実装に追加で、Cクラスのsample()にはB.super.sample();を実装 */
  

//   // 7-5
//   // @Override
//   // public String toString() { // toString()メソッドは、Java.lang.Objectクラスに定義されているメソッド
//   //   return "B";
//   // }

//   // 試した
//   // @Override
//   // public String toString2() {
//   //   return "B";
//   // }
// }

// // 7-6
// // public interface B extends A {
// // }

// // 7-7
// // public interface B {
// //   default void test() {
// //     System.out.println("B");
// //   }
// // }
