public class Main {
  public static void main(String[] args) {
    // System.out.println();

    // 4-17 実行結果は、、
    // int total = 0;
    // a: for (int i = 0; i < 5; i++) {
    //   b: for (int j = 0; j < 5; j++) {
    //     if (i % 2 == 0) continue a;
    //     if (3 < j) break b;
    //     total += j;
    //   }
    // }
    // System.out.println(total);
    // 12 試験対策で、紙に書いてループを整理しながらした方が良い！

    // 4-16
    // 以下はchat GPTによるラベル活用例、主に二重構造以上のforループでラベル活用が有効。
    // outerLoop:  // ラベル
    // for (int i = 0; i < 5; i++) {
    //   for (int j = 0; j < 5; j++) {
    //     if (i * j > 6) {
    //       System.out.println("Breaking");
    //       break outerLoop;  // 外側のループを終了
    //     }
    //     System.out.println(i + " " + j);
    //   }
    // }

    // 4-15 出力結果は、
    // int[] array = {1, 2, 3, 4, 5};
    // int total = 0;
    // for (int i : array) {
    //   if (i % 2 == 0)
    //     continue; // 処理内容覚えて
    //     total += i;
    // }
    // System.out.println(total);
    // 結果は9、一つずつ処理を焦らずやって


    // 4-14 出力結果は、
    // String[] array = {"A", "B"};
    // for (String a : array) {
    //   //System.out.println("いち");
    //   for (String b : array) {
    //     //System.out.println("　に");
    //     if ("B".equals(b)){
    //       break;
    //     }
    //     System.out.println(b);
    //   }
    // }
    // AA


    // 4-13 ポストインクリメント 結果だけ確認する。
    // int num = 10;
    // do {
    //   num++;
    // } while (++num < 10);
    // System.out.println();

    // int num = 10;
    // while (num++ < 11) {
    //   System.out.println("1回ループ");
    //   num++;
    // }
    // System.out.println(num);

    // 4-12 コンパイル後の結果は、
    // String[] array = {"A", "B", "C"};
    // for (String str : array) { // str 部分を一時変数と呼ぶ
    // System.out.println(str);
    //   str = "D"; // ここポイント、配列データ書き換えてない！
    //   System.out.println(str);
    //   // System.out.println(array[0]);
    // }
    // System.out.println(array[0] + "???");
    // for (String str : array) {
    //   System.out.println(str);
    // }
    // 結果、ABC

    // 試した
    // String[] array2 = {"A", "B", "C"};
    // String[] copy = array2;
    // System.out.println(array2);
    // System.out.println(copy);
    // copy[0][1][2] = {"D", "E", "F"}; // エラー ３次元配列なてる

    // 4-12 補足 通常for文で、配列データ置き換えられる場合
    // for (int i = 0; i < array.length; i++) {
    //     array[i] = "D";
    //     System.out.print(array[i]);
    // }
    // for (String element : array) {
    //     System.out.print(element);  // ここで "D" が再び出力される
    // }
    // array.all できると思ったら出来なかった。全て出力するには拡張for文だけかも

    // 4-11
     // 簡単なので省略

    // 4-10  無限ループにならないのは？
    // for (int = 0; false; i++) {
    //   System.out.println(i);
    // }
    // 条件値にfalseはできない。

    // ！！！ここ難しい、理解するにとどめた方がいいかも！！！
    // 4-9 コンソールに10と表示するには？ /*問題箇所*/
    // int array[][] = new int[][] {{1, 2}, {2, 3, 4}};
    // int total = 0;
    //   // System.out.println(array.length); // 2
    //   // System.out.println(array[0][0]);
    //   // System.out.println(array[0][2]); // コンパイル成功するが、実行時に例外スロー
    // for (int i = 0; i < array.length; i++) {
    //   for (int j = i; j < array[i].length; j++) { // array[i].length 2
    //   System.out.println((i + 1) + "-" + (j + 1) + "周目");
    //   System.out.println("iは  " + i);
    //   System.out.println("jは  " + j);
    //   System.out.println("array[i][j]は  " + array[i][j]);
    //   total += array[i][j];
    //   System.out.println("totlaは " + total);
    //   }
    // }
    // System.out.println(total);
    // ポイントは初期価値はループしない。初回の設定値を維持する。


    // 4-8　実行結果は何
    // for (int i = 0; i < 3; i++, period()) { // privateメソッド
    //   System.out.print(i);
    // }
    // 結果は　0, 1, 2, %

    // 4-7 実行結果は
    // for (int i = 0, j = 0; i < 3, j < 5; i++) {
    //   System.out.println(i++);
    //   j +=i;
    // }
    // 結果、コンパイルエラー、i < 3, j < 5;を論理演算子で実装するべき、２つに分けない


    // 4-6  コンソールに0を表示して・問題は条件式部分。
    // for (int i = 0; i == 0; i++ ) {
    //   System.out.println(i);
    // }
    // i == 0
    // i < 0
    // 0 < i
    // 1 < 2 ※※※ 無限ループ


    // 4-5  実行結果は
    // int a = 1;
    // for (int b = 2, total = 0; b <= 5; b++) {
    //   total = a * b;
    // }
    // System.out.println(total);

    // 4-4 for(初期化文、条件文、更新文)
    // for (int i = 0, long j = 0; i < 5; i++) {
    //   System.out.println(i * j);
    // }
    // 結果、コンパイルエラー、初期化文の型は同じでないといけない。for(初期化文①, 初期化文②; 条件文、更新文)
    // for (int i = 0, j = 0; i < 5; i++) とか
    // 型不一致のエラーを解消する別の方法、forブロックの外で定義すること
    // int i = 1;
    // long j = 2;
    // for (; i < 5; i++) {
    //   System.out.println(i * j);
    // }


    // 4-3
    // int a = 0;
    // while (a < 5)
    //   do
    //     a++;
    //     System.out.println(a);
    //   while (true); // 無限ループ注意
      // 結果 コンパイルエラー
    // 練習 !!無限ループ注意!!
    // int cnt = 0;
    // while (cnt < 5, cnt++)
    //   System.out.println("A");
    //   System.out.println("B");
    // 結果はAが無限ループ、括弧省略の場合は、１行だけを対象とする。


    // 4-2
    // int a = 0;
    // do {
    // System.out.println(a++); // while前に実行させたい処理
    // } while (a < 5); // 結果 0 ~ 4 出力
    // 結果 0
    // while (5 < a) {
    //   System.out.println(a++);
    // } // 選択肢D 結果 0
      

    // 4-1 コンソールに 0 ~ 4 を出力できる、while()の条件文は？→ b > 5
    // int a = 11;
    // int b = 0;
    // while (b < 5) {
    //   if (5 < a) {
    //     System.out.println(b);
    //   }
    //   a--;
    //   b++;
    // }
  }
  // 4-8 のプライベートメソッド
  // private static void period() {
  //   System.out.print(", ");
  // }
}
