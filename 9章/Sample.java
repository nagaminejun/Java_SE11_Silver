// import java.time.DayOfWeek; // 9-6
// import java.time.LocalDate; // 9-5, 9-6
// import java.util.HashMap; // 9-19
// import java.util.Map; // 9-19

public class Sample {
  public static void main(String[] args) {

    // 9-19
    // Map<Integer, Item> map = new HashMap<Integer, Item>();
    // map.put(1, new Item(1, "A"));
    // map.put(2, new Item(2, "B"));
    // map.put(3, new Item(3, "C"));
    // map.put(1, new Item(1, "AAA"));
    // map.put(null, new Item(0, "default"));

    // System.out.println(map.size());

    // // 試した
    // System.out.println(map.get(1));
    // System.out.println(map.get(1).getName());

    // Map<Integer, Item> map = new Map<Integer, Item>();
    // 結果エラー
    // Sample.java:22: エラー: Mapはabstractです。インスタンスを生成することはできません
    // Map<Integer, Item> map = new Map<Integer, Item>();
    //                          ^

    // HashMap<Integer, Item> map = new HashMap<Integer, Item>();
    // 結果、エラー無いが、Map型宣言（インターフェイス）が慣習的であり推奨。理由はchatGPT履歴へ。拡張性のため。


    // 9-6
    // LocalDate a = LocalDate.of(2019,8,19);
    // LocalDate b = LocalDate.of(2019,8,20); // 左記はテスト用で修正、 LocalDate.now();
    // b.with(DayOfWeek.MONDAY); // 2019,8,19は月曜日
    // System.out.println(a.equals(b) + " , " + a.isBefore(b));
    // // 確認用
    // System.out.println(b);
    // System.out.println(b.with(DayOfWeek.MONDAY));

    // 9-5
    // LocalDate a = LocalDate.of(2015, 01, 1);
    // LocalDate b = LocalDate.parse("2015-01-01");
    // System.out.println(a.equals(b));
    // // 確認用
    // System.out.println(a == b); // インスタンスが違うのでfalse
    // System.out.println(a);
    // System.out.println(b);

    // 9-4
    // char a = '0';
    // int num = 0;
    // if (Character.isAlphabetic(a)) {
    //   num++;
    // }
    // if (Character.isDigit(a)) {
    //   num++;
    // }
    // if (Character.isLowerCase(a)) {
    //   num++;
    // }
    // System.out.println(num);
    // // 以下、確認用
    // System.out.println(Character.isAlphabetic(a));
    // System.out.println(Character.isDigit(a));
    // System.out.println(Character.isLowerCase(a));
  }
}

// public class Sample {

//   // 9--2
//   // private int id;
//   // private String name;
//   // public Sample(int id, String name) {
//   //   super();
//   //   this.id = id;
//   //   this.name = name;
//   // }

//   // public int getId() {
//   //   return id;
//   // }
//   // public String getName() {
//   //   return name;
//   // }
// }
