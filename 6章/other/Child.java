package other;
import ex26.Parent;

public class Child extends Parent {
  public static void main(String[] args) {
    // int num = 1; // test

    // System.out.println(num); // コンパイルエラー、教材のコードだと、継承元（親）フィールドが非静的だとアクセス不可。

    // System.out.println(Parent.num); // test
    // Parent parent = new Parent();
    // System.out.println(parent.num);  // インスタンスを通じてフィールドにアクセス

    // Child child = new Child(); // Child クラスのインスタンスを作成
    // System.out.println(child.num); 
  }
}
