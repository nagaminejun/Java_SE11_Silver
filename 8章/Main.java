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

    // 8-3で、ローカル変数valをラムダ式内で出力する場合
    // String val = "A";
    // Function f = () -> {
    //   System.out.println(val);
    // };
    // f.test();

    // 8-2 insert code hereに入るコードで誤っているものは
    // insert code here
    
    // System.out.println(f.test("Lamda"));

    // 8-1
    // Algorithm algorithm = (String name) -> {
    // System.out.println("hello, " + name);
    // };
    // Service s = new Service();
    // s.setLogic(algorithm);
    // s.doProcess("Lambda");
  }

  // 8-2
  // private static interface Function {
  //   String test(String name);
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
//   void test(val);
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
