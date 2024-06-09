// 7-18
public class Sample {
  // private int num;
  // public Sample(int num) {
  //   // setNum(n);
  //   // this.num = num;
  //   // this.setNum(num);
  // }

  // num = num; // これはエラーないが出力 0 になる。理由はコンストラクタ引数（int num）と、フィールド引数が同名のため、numだけだと、コンストラクタ引数のnumと判断されるらしい
  // 以下コードでやると出力 10 となる
  //  public Sample(int n) {
  //   System.out.println(num + " 暗黙的にthis ");
  //   num = n; // num は暗黙的にthis付与される。
  //   System.out.println(num + " 暗黙的にthis 2!");
  // }

  // public int getNum() {
  //   return num;
  // }

  // public void setNum(int num) {
  //   this.num = num;
  // }

  // 試した
  public void test() {
    
  }
}
