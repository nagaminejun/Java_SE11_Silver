public class Main {
  public static void main(String[] args) {
    System.out.println();

    // 5-10 実行結果は、
    // int[][] arrayA = { { 1, 2 }, { 1, 2 }, {1, 2, 3} };
    // int[][] arrayB = arrayA.clone();
    // // int[][] arrayB = new int[2][3]; // 試してみて
    // // System.out.println(arrayA);
    // // System.out.println(arrayA[0]);
    // // System.out.println(arrayB);
    // // System.out.println(arrayB[0]);
    // // arrayB = arrayA;
    // int total = 0;
    // for (int[] tmp : arrayB) {
    //   for (int val : tmp) {
    //     total += val;
    //   }
    // }
    // System.out.println(total);
    // 結果 12

    // 試した
    // System.out.println(arrayA);
    // System.out.println(arrayB);
    // System.out.println(arrayA.clone()); // 新しいオブジェクト生成
    // System.out.println(arrayA == arrayB);
    // System.out.println(arrayA[0][0] == arrayB[0][0]);
    // System.out.println(arrayA.equals(arrayB));

    // 5-9 実行結果は、
    // A[] array = { new C(), null, new D() };
    // Object[] objArray = array;
    // // 結果、エラー無し

    // // 試した
    // A[] array = { new B() }; // エラー: Bはabstractです。インスタンスを生成することはできません
    // A[] array = { new C() };
    // C[] cgata = array;

    // B[] bgata = array;
    // C[] cgata = array;
    // D[] dgata = array;
    // System.out.println(objArray[1]); // null
    // System.out.println(objArray[0]); // C@727803de

    // 5-8 実行結果は、
    // String[][] array = { { "A", "B" }, null, { "C", "D", "E" } };
    // int total = 0;
    // for (String[] tmp : array) {
    //   total += tmp.length;
    // }
    // System.out.println(total);
    // 結果 コンパイル通るが、実行時エラー
    // nullを{}に置き換えると、出力成功。

    // 3次元配列の練習
    // String[][][] ren = new String[3][2][1];
    // // 1層目の初期化
    // ren[0][0][0] = "A";
    // ren[0][1][0] = "B";

    // // 2層目の初期化
    // ren[1][0][0] = "C";
    // ren[1][1][0] = "D";

    // // 3層目の初期化
    // ren[2][0][0] = "1"; // アルファベットが足りない場合は数字
    // ren[2][1][0] = "2";
    // System.out.println(ren[0][1][0]);

    // String[][][] ren = { 
    //     { {"A"}, {"B"} },
    //     { {"C"}, {"D"} },
    //     { {"1"}, {"2"} }
    // };
    // System.out.println(ren[0][1][0]);

    // String[][] array = { { "A", "B" }, {}, { "C", "D", "E" } };
    // System.out.println(array[0]);
    // int total = 0;
    // for (String[] tmp : array) {
    //   total += tmp.length;
    // }
    // System.out.println(total);

    // String[] array2 = new String[3];
    // System.out.println("結果は " + array2[0]);
    // System.out.println("結果は " + array2[1]);
    // System.out.println("結果は " + array2[2]);


    // 5-7 コンパイルエラーにならないのはどれ
    // int[] a = new int[2];
    // int b[][] = {}; // 空配列の生成は可能
    // int[][] c = new int[][]{};

    // int[] d;
    // d = new int[]{ 2, 3 };

    // int e[];
    // e = { 2, 3 };
    // 回答 BCD
    /* BCDがコンパイルエラーになる実装はchatGPT履歴へ */

    // 試した
    // int[] a = new int[2];
    // a[0] = 2;
    // a[1] = 3;　// 成功

    // int[][] d;
    // d = new int[][]{}; // 上述で宣言した多次元数を、new で「同じ数」大カッコで記述する


    // int[] b = new int[2]{ 2, 3 }; // エラー
    // int[] c = new int[3]; // 長さ3のint型配列を作成し、全ての要素を0で初期化
    // System.out.println(c[1]); // 0
    // Integer[] d = new Integer[5]; // 要素は全てnullで初期化される
    // System.out.println(d[1]);
    // String[] e = new String[5]; // 同様に全要素がnullで初期化
    // System.out.println(e[1]);

    // 5-6 コンパイル、実行結果は、
    // String[] array = {"A", "B", "C", "D"};
    // array[0] = null;
    // for (String str : array) {
    //   System.out.println(str);
    // }
    /* 結果
    null
    B
    C
    D */
    // 試した
    // array[0] = ""; // エラーなし

    // 5-5 実行結果は、
    // Item[] items = new Item[3];
    // int total = 0;
    // for (int i = 0; i < items.length; i++) {
    //   items[i] = new Item();
    //   System.out.println(items[i]);
    //   total += items[i].price;
    // }
    // System.out.println(total);
    // 結果、実行時エラー、解説はchat GPTの履歴見て
    /* Exception in thread "main" java.lang.IllegalAccessError: class Main tried to access field Item.price (Main is in unnamed module of loader com.sun.tools.javac.launcher.Main$MemoryClassLoader @103f852; Item is in unnamed module of loader 'app')
        at Main.main(Main.java:9) */

    // 5-4 コンパイルエラーになるのは、、
    // int a[] = new int[2][3];
    // int[] b = new int[2.3];
    // int c[] = new int[2 * 3];

    // int x = 2, y = 3;
    // int[] d = new int[x * y];

    // int[][] e = new int[2][]; // １次元側配列に指定あれば、２次元側に指定無しでもエラー起きない。
    // int f[][] = new int[][3]; // エラー。1次元側のインデックス指定は必須
    // int[2][2] array = new int[2][2]; // エラー
    // 答え ABF
    // 試した
    // System.out.println(e[0][1]);
    // System.out.println(e[0]);
    // int[][] array = new int[3][]; // 2行だけが決定し、各行の列数はまだ未定
    // array[0] = new int[3];       // 最初の行を3列で初期化
    // array[1] = new int[4];       // 2行目を4列で初期化
    // System.out.println(array[0][3]); // エラー
    // System.out.println(array[1][3]); // 成功、int[4]だから、
    // System.out.println(array[2][2]); // エラー、1次元側は２つまで


    // 5-3 配列型変数の宣言として、正しいものは？または全て誤りか、全て正しいか。
    // int[3] a;
    // int b[2];
    // int[2] c[];
    // int d[3][];
    // 全部誤り E

    // 5-2 どこでコンパイルエラーが発生する、または発生しない？
    // int[] a;
    // int b[];
    // int[][] c;
    // int d[][];
    // int[] e[];
    // int[][] f[];
    // コンパイルエラー発生しない

    // 解説メモ、試した
    // int[] a;
    // int b[]; []を後述可能
    // int[][] c;
    // int d[][]; 2次元配列
    // int[] e[]; この記述も2次元配列
    // int[][] f[]; こちらは３次元配列
    // int[] e[] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    // System.out.println(e[2][1]);
    // int[][] f[] = {
    //   { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} },
    //   { {10, 11, 12}, {13, 14, 15}, {16, 17, 18} },
    //   { {19, 20, 21}, {22, 23, 24}, {25, 26, 27} }
    // };
    // System.out.println(f[0][0][0]);


    // 5-1 実行結果は、
    // int[] array = new int[5];
    // System.out.println(array[4]);
    // 結果、[I@544a2ea6

    // 試した
    // int[] array = new int[5];
    // System.out.println(array[4]);
    // 結果 0

    // 試した 初期値に違いある。覚えて。
    // プリミティブ型か、ラッパークラスか
    // Integer[] array = new Integer[5];
    // System.out.println(array[4]);
    // 結果 null

    // Integer[] array = new Integer[5];
    // System.out.println(array[4]);
    // 結果 null

  }
}
