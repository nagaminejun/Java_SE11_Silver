import java.util.ArrayList; // 9-2 7 8 9 10 11 12 13
import java.util.Arrays;
import java.util.List;
import java.util.Collections; // 9-3で試す用
import java.util.Comparator;

public class Main {
  public static void main(String[] args) {
    System.out.println();

    // 9-18
    // List<String> list = List.of("A", "B", "C");
    // list.forEach(str -> System.out.println(str));
    // list.for(str -> System.out.println(str))
    // list.forEach(System.out::println);
    // list.forEach(System.out::println());
    // list.for(System.out::println);

    // 試した
    // list.forEach(System.out.println());

    // 試した
    // List<Integer> list = List.of(1, 2, 3);
    // list.forEach(str -> System.out.println(str));
    // list.forEach(str -> System.out.println(str));

    // 教材のサンプルコードを試す
    // List<String> list = List.of("A", "B", "C");
    // Consumer<String> logic = forEachTest.Main::test;
    // list.forEach(logic);

    // 9-17
    // List<String> list = new ArrayList<>(
    //   Arrays.asList(new String[]{"A", "B", "C"})
    // );
    // list.removeIf(
    //   (String s) -> {
    //     return s.equals("B");
    //   }
    // );
    // System.out.println(list)

    // 試した
    // List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
    // // 偶数を削除する
    // numbers.removeIf(n -> n % 2 == 0);
    // System.out.println(numbers);

    // 9-16
    // String[] a = {"B", "X"};
    // String[] b = {"B", "A"};
    // System.out.println(Arrays.compare(a, b));

    // 試した
    // int[] c = {1};
    // int[] d = {1, 1, 1, 100};
    // System.out.println(Arrays.compare(c, d));
    // 第一引数までは数値の比較だが、一致で次の要素へ進んで比較引数がない場合は、「要素の長さ」の比較に変更される。
    // 結果、-3

    // int[] e = {1, 1, 2, 33, 1, 1, 3};
    // int[] f = {1, 0};
    // System.out.println(Arrays.compare(e, f));
    // 引数2番目で、数値の比較が可能となり、比較結果を出す

    // 試した
    // String[] a = {"apple"};
    // String[] b = {"banana"};
    // System.out.println(Arrays.compare(a, b));


    // 9-15
    // String[] a = {"b", "c"};
    // String[] b = {"a", "b", "c"};
    // System.out.println(Arrays.mismatch(a, b));
    // 結果 0  0番目の要素がミスマッチ、最初に該当する要素のみ出力

    // 試した
    // String[] a = {"a", "c", "d"};
    // String[] b = {"a", "b", "c"};
    // System.out.println(Arrays.mismatch(a, b));
    // 結果 1


    // 9-14 試した
    // Integer[] array = {1, 2, 3};
    // var list = Arrays.asList(array);
    // System.out.println(list);
    // list.add(9); // 変更不可

    // 試した
    // Integer[] array = {1, 2, 3};
    // System.out.println(array);
    // array.add(9); // 配列にaddメソッドは無い
    // System.out.println(array);
    // 結果エラー

    // Integer[] array = new Integer[3];
    // System.out.println(array[0]);

    // List<Integer> list = Arrays.asList(1, 2, 3);
    // System.out.println(list);
    // // list.add(9); // 変更不可
    // list.set(0, 100);
    // System.out.println(list);

    // var list = List.of(1, 2, 3);
    // System.out.println(list);
    // list.add(1); // 変更不可

    // 9-13
    // ArrayList<String> list = new ArrayList<>();
    // list.add("A");
    // list.add("B");
    // list.add("C");
    // list.add("D");
    // list.add("E");
    // for (String str : list) {
    //   if ("C".equals(str)) {
    //     list.remove(str);
    //   }
    // }
    // for(String str : list) {
    //   System.out.println(str);
    // }

    // 試した
    // ArrayList<String> list = new ArrayList<>();
    // list.add("A");
    // list.add("B");
    // list.add("C");
    // list.add("D");
    // list.add("E");
    // for (String str : list) {
    //   if ("D".equals(str)) {
    //     list.remove(str);
    //   }
    // }
    // for(String str : list) {
    //   System.out.println(str);
    // }
    // 結果、出力成功

    // 9-12
    // ArrayList<String> list = new ArrayList<>();
    // list.add("A");
    // list.add("B");
    // list.add("C");
    // // list.add("D"); // 左記を追加すると実行時例外エラー
    // for (String str : list) {
    //   if ("B".equals(str)) {
    //     list.remove(str);
    //   } else {
    //     System.out.println(str);
    //   }
    // }
    // 結果 Aのみ出力、エラーでない理由：イテレータがmodCountのチェック検知が行われる前に、forループが終了するため。list４つ目追加したらエラー発生する。

    // 9-11
    // ArrayList<Item> list = new ArrayList<>();
    // list.add(new Item("A", 100));
    // list.add(new Item("B", 200));
    // list.add(new Item("C", 300));
    // list.add(new Item("A", 100));
    // System.out.println(list); // 試した [Item@b7f23d9, Item@61d47554, Item@69b794e2, Item@3f200884]
    // list.remove(new Item("A", 100));
    // for (Item item : list) {
    //   System.out.println(item.getName());
    // }
    // なぜremoveでnewするのか、chatGPTの履歴見て

    // 9-10
    // ArrayList<String> list = new ArrayList<>();
    // list.add("A");
    // list.set(0, "B");
    // list.add("C");
    // list.set(1, "D");
    // for (String str : list) {
    //   System.out.println(str);
    // }

    // 9-9
    // ArrayList<String> list = new ArrayList<>();
    // list.add("A");
    // list.add(2, "B");
    // System.out.println(list);
    // list.add("C");
    // list.add("D");
    // for (String str : list) {
    //   System.out.print(str);
    // }
    // 結果、実行時エラー、理由：2という部分、正しくは0 or 1のindex番号を指定、

    // 9-8
    // ArrayList list = new ArrayList<>();
    // list.add("A");
    // list.add(10);
    // list.add('B');
    // for (Object obj : list) {
    //   System.out.print(obj);
    // }
    // 警告の理由：ArrayListで型指定していないため、型安全性が脅かされる、<Object>追加でOK
    // 例：ArrayList<Object> list = new ArrayList<>();

    // 9-7 ArrayListの説明で正しいものは
    // A. nullは扱えない
    // B. 動的な配列として動作する
    // C. 重複した値は扱えない
    // D. スレッドセーフではない
    // E. 値を追加する箇所を制御できる

    // 試した ACE
    // ArrayList<Integer> numbers = new ArrayList<>();

    //   // 要素を追加
    //   numbers.add(10);
    //   numbers.add(20);
    //   numbers.add(30);
    //   numbers.add(null);

    //   System.out.println("初期のリスト: " + numbers);

    //   // インデックス1（2番目の位置）に新しい要素40を挿入
    //   numbers.add(1, 40);

    //   System.out.println("新しい要素を挿入後のリスト: " + numbers);

    //   // インデックス3（4番目の位置）に新しい要素50を挿入
    //   numbers.add(3, 50);

    //   System.out.println("さらに新しい要素を挿入後のリスト: " + numbers);

    //   // インデックス3（4番目の位置）に重複した要素50を挿入
    //   numbers.add(3, 50);

    //   System.out.println("重複した要素を挿入後のリスト: " + numbers);

    // 9-3
    // List<Integer> list = Arrays.asList(new Integer[] {1, 2, 3});
    // // System.out.println(list);
    // // ここに実装して、321と出力したい、
    // list.sort((a, b) -> -a.compareTo(b));
    // // System.out.println(list);
    // for (Integer num : list) {
    //   System.out.println(num);
    // }

    // sortメソッド内でラムダ式が利用された場合に、Comparatorオブジェクトと解釈される

    // 試した
    // List<Integer> list = Arrays.asList(new Integer[] {1, 2, 3});
    // Comparator<Integer> comparator = (a, b) -> -a.compareTo(b);
    // list.sort(comparator);
    // for (Integer num : list) {
    //   System.out.println(num);
    // }

    // 試した
    // List<Integer> list = Arrays.asList(new Integer[] {1, 2, 3});
    // Collections.sort(list, Collections.reverseOrder());
    // // Collections.sort(list, -1); // これはエラー
    // for (Integer num : list) {
    //   System.out.println(num);
    // }

    // 試した
    // List<Integer> list = Arrays.asList(new Integer[] {1, 2, 3});
    // // System.out.println(list.get(0));
    // list.sort(1); // nullだと成功、null以外ならラムダ式で
    // for (Integer num : list) {
    //   System.out.println(num);
    // }
    // 結果エラー
    // Main.java:23: エラー: インタフェース List<E>のメソッド sortは指定された型に適用できません。
    // list.sort(1);
    //     ^
    // 期待値: Comparator<? super Integer>
    // 検出値:    int
    // 理由: 引数の不一致: intをComparator<? super Integer>に変換できません:
    // Eが型変数の場合:
    //     インタフェース Listで宣言されているE extends Object
    // エラー1個
    // エラー: コンパイルが失敗しました

    // 9-2
    // Sample[] samples = {
    //   new Sample(2, "B"),
    //   new Sample(3, "C"),
    //   new Sample(1, "A"),
    //   new Sample(4, "D")
    // };
    // //
    // List<Sample> list = new ArrayList<Sample>(Arrays.asList(samples));
    // System.out.println(list);
    // list.sort(new SampleComparator());
    // for (Sample s : list) {
    //   System.out.println(s.getName());
    // }
  }
}
