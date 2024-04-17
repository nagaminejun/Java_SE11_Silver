public class Sample {
  public static void main(String[] args) {

    // 8-4
    // int cnt = 0;
    // Runnable r = () -> {
    //   for (cnt = 0; cnt < 10; cnt++) {
    //     System.out.println(cnt++);
    //   }
    // };
    // new Thread(r).start();
    // 結果、コンパイルエラー
    // ラムダ式内でint cnt = 0;を定義すればOK、が、出力がされない？
    // Runnable r = () -> {
    //   for (int cnt = 0; cnt < 10; cnt++) {
    //     System.out.println(cnt++);
    //   }
    // };
    // new Thread(r).start();
  }
}
