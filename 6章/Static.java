public class Static {
  public static int staticNum = 0;

  public static void setStaticNum(int value) {
    staticNum = value;  // 静的メソッドから静的フィールドに値を設定
  }

  public static void printStaticNum() {
    System.out.println("StaticNum: " + staticNum);  // 静的フィールドの値を出力
  }
}
