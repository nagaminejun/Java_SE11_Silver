public class Sample {
  private String[] array;

  // 12-68
  // 次のコンストラクタでコンパイル可能、かつarrayフィールドに参照をセットすることができるものは？
  // E
  // public Sample(String... array) {
  //   this.array = array;
  // }

  // F
  // public Sample(Object[] array) {
  //   this.array = array;
  // }

  // 12-60
  // public static void main(String[] args) {
  //   short s1 = 10;
  //   Integer s2 = 20;
  //   Long s3 = (long) s1 + s2;
  //   System.out.println(s3);
  // }
}
