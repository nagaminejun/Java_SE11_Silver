public class Sample {

  // 3-10  インスタンスの同値性に関する問題、オーバーロード
  // ** 問題点を認識して **
  private int num;
  public Sample(int num) {
    this.num = num;
    System.out.println(this.num);
  }
  // public boolean equals(Sample obj) { // (Sample obj)部分はオーバーロード
  //   System.out.println(this); // 問題理解のために記述、
  //   System.out.println(obj); // 出力されない理由を理解して
  //   if (obj == null) {
  //     return false;
  //   }
  //   return this.num == obj.num;
  // }

  // 3-9 equalsメソッドのオーバーライド
  // private int num;
  // private String name;

  // public Sample(int num, String name) {
  //   this.num = num;
  //   this.name = name;
  // }
  
  // public boolean equals(Object obj) {
  //   if (obj == null) {
  //     return false;
  //   }
  //   if (obj instanceof Sample) {
  //     System.out.println(obj.getClass());
  //     //System.out.println(this.name); // これは a
  //     Sample s = (Sample) obj;
  //     //System.out.println(s.name); // これは b
  //     return s.num == this.num;
  //     // equalsメソッドのデフォルトでは、this.equals(obj)
  //   }
  //   return false;
  // }
  /* なぜ,Sample s = (Sample) obj;でcastする？
  キャストの目的は、Object 型の変数である obj を Sample 型に変換することで、Sample クラスのメンバーにアクセスするための型安全性を確保することです。これにより、Sample クラスに固有のフィールドやメソッドにアクセスできます。*/

  // 3-8
  // private int num;
  // public Sample(int num) {
  //   this.num = num;
  // }
}
