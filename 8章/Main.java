// 8-5
// import java.util.Arrays;
// import java.util.List;
import java.util.function.*;

public class Main {
  public static void main(String[] args) {
    System.out.println();

    // 8-8 java.util.function.Consumer の問題

    // 8-7
    // Function<String, Integer> func = (str) -> {
    //   return Integer.parseInt(str);
    // };
    // System.out.println(func.apply("100") * 2);

    // // 8-6 試す
    // Predicate<String> isNotEmpty = s -> !s.isEmpty();
    // System.out.println(isNotEmpty.test("Hello"));

    // Function<String, Integer> length = String::length;
    // System.out.println(length.apply("Hello")); 

    // 8-5
    // List<Sample> list = Arrays.asList(
    //   new Sample(10),
    //   new Sample(20),
    //   new Sample(30));
    // Function<Sample, Boolean> x = s -> list.contains(s);////////
    // if (x.test(new Sample(20))) {
    //   System.out.println("ok");
    // }


    // 8-3
    // String val = "A";
    // Function f = (val) -> {
    //   System.out.println(val);
    // };
    // f.test("B");

    // 8-3で、ローカル変数valを出力する場合、ラムダ式内の変数を同名にしない
    // String val = "A";
    // Function f = (anotherVal) -> {
    //   System.out.println(anotherVal);
    // };
    // f.test(val);

    // 8-2 insert code hereに入るコードで「誤っているもの」は
    // insert code here

    // Function f = (name) ->{
    //   return  "hello, " + name;
    // };

    // 試した
    // Function f = name, n2 -> "hello, " + name; // エラー
    // Function f = (name) -> "hello, " + name;
    // Function f = name -> "hello, " + name;
    // Function f = (name) ->{ return  "hello, " + name; };
    // Function f = (name) -> return "hello, " + name; //  エラー
    // Function f = (name) ->{ return  "hello, "}; // エラー
    // Function f = (name) -> return name; //  エラー
    // Function f = (name) -> return  "hello, "; // エラー: 式の開始が不正です
    // Function f = (name) -> "hello, ";

    // 8-1
    // Algorithm algorithm = (String name) -> {
    // System.out.println("hello, " + name);
    // };
    // Service s = new Service();
    // s.setLogic(algorithm);
    // s.doProcess("Lambda");

    // Service s2 = new Service();
    // s2.hello();

    // ラムダ式練習、ラムダ式を使用した匿名クラスのオブジェクト生成
    // Runnable runnable = () -> System.out.println("This is a lambda expression");
    // runnable.run();

    // ラムダ式、練習２ Animalインターフェイス
    // Animal myDog = () -> System.out.println("わん！");
    // myDog.makeSound();
    // ラムダ式を使用しない場合は、Dogクラスやファイルを生成して、生成したインスタンスから抽象メソッドを具現化する。

    // ラムダ式使用しない、匿名クラスのサンプル
    // Runnable runnable = new Runnable() {
    // @Override
    // public void run() {
    //   System.out.println("This is an anonymous class");
    //   }
    // };
    // runnable.run();
  }


  // 8-2
  // private static interface Function {
  //   String test(String name);
  // }

  // 試した
  // private static interface Function {
  //   String test(String name, String name2);
  // }
}
// 8-5
// class Sample {
//   private int num;
//   public Sample(int num) {
//     this.num = num;
//   }
//   public boolean equals(Object obj) {
//     if (obj instanceof Sample == false) {
//       return false;
//     }
//     if (this.num == ((Sample) obj).num) {
//       return true;
//     }
//     return false;
//   }
// }

// 8-5 選択肢
// A
// Predicate<Sample> x = s -> list.contains(s);

// B
// Supplier<Sample> x = s -> list.contains(s);

// C
// Consumer<Sample> x = s -> list.contains(s);

// D
// Function<Sample> x = s -> list.contains(s);


// 8-3
// interface Function {
//   void test(String val);
// }

// 8-3で、ローカル変数valをラムダ式内で出力する場合
// interface Function {
//   void test();
// }

// 8-2 選択肢
// A
// Function f = (name) -> {
//   return "hello, " + name;
// };

// B
// Function f = (name) -> {
//   "hello, " + name;
// };

// C
// Function f = (name) -> return "hello, " + name;

// D
// Function f = (name) -> "hello, " + name;

// E
// Function f = name -> {
//   return "hello, " + name;
// };
