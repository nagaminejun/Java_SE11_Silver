public class StaticAccessDemo {
  public static int staticNum = 100;  // 静的フィールド
  public int instanceNum = 200;       // 非静的フィールド

  public static void staticMethod() {
    System.out.println("StaticNum from static method: " + staticNum);  // 静的フィールドへのアクセス

    // 静的でないフィールドへのアクセス試み
    // System.out.println("InstanceNum from static method: " + instanceNum); // コンパイルエラー

    // 静的でないメソッドへのアクセス試み
    // instanceMethod();  // コンパイルエラー
  }

  public static void instanceMethod() {

    System.out.println("StaticNum from static method: " + staticNum);  // 静的フィールドへのアクセス

    // System.out.println("InstanceNum from instance method: " + instanceNum); // 非静的フィールドへのアクセス
  }

  public static void main(String[] args) {
    staticMethod(); // 静的メソッドを呼び出す

    StaticAccessDemo demo = new StaticAccessDemo();
    demo.instanceMethod(); // ※ 静的メソッドから非静的メソッドを呼び出しているのではない。「インスタンス」メソッドから呼び出している。
    StaticAccessDemo.instanceMethod();
  }
}
