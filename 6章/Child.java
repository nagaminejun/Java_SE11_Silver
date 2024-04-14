// package other;
// import ex26.Parent;
// package chapter6;
// // 6-26

public class Child extends Parent {
  public static void main(String[] args) {
    Child child = new Child();
    System.out.println(child.num);
  }
}


// Parentクラスのnumの修飾子を変えても上記ではエラーです。解消するには下記、staticを削除し、インスタンスから呼び出す
// public class Child extends Parent {
//   public void main(String[] args) {
//     Child child = new Child();
//     System.out.println(child.num);
//   }
// }
