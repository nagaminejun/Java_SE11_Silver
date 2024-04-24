public class Sample {
  public static void main(String[] args) {

    // 8-4
    // int cnt = 0;
    // Runnable r = () -> {
    //   for (cnt = 0; cnt < 10; cnt++) {エラー: ラムダ式から参照されるローカル変数は、finalまたは事実上のfinalである必要があります
    //     System.out.println(cnt++);エラー: ラムダ式から参照されるローカル変数は、finalまたは事実上のfinalである必要があります
    //   }
    // };
    // new Thread(r).start();
    // 結果、コンパイルエラー、ラムダ式「内」でcnt変数の値を変えてはならない


    // 試した cnt変数の値を変えずに？
    // int cnt = 0;
    // Runnable r = () -> {
    //   for (int i = 0; i < 10; i++) {
    //     System.out.println(cnt + i);
    //   }
    // };
    // System.out.println(cnt);
    // new Thread(r).start();
  }
}
