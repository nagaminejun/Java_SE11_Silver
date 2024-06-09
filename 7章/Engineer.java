// 7-14
public class Engineer extends Employee {
  public void create() {
    System.out.println("create future");
  }
}

// 7-14 試した
// public class Engineer extends Employee implements Worker {
//   public void create() {
//     System.out.println("create future");
//   }
// }

// 7-13
// public class Engineer extends Employee implements Worker {}

// もし以下ならエラー
// public class Engineer implements Worker {} //  extends Employee を削除 継承関係にない
