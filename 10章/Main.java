// import java.util.ArrayList;
// import java.util.List;

public class Main {
  public static void main(String[] args) {
    System.out.println();

    // 問題10-17 
    // main(args);

    // 問題10-16
    // String str = null;
    // if (str.equals("")) {
    //   System.out.println("blank");
    // } else {
    //   System.out.println("null");
    // }

    // 試した
    // String str = "null";
    // String str2 = null;
    // System.out.println(str.length());
    // if (str.equals(str2)) {
    //   System.out.println("blank");
    // } else {
    //   System.out.println("null!");
    // }

    // String str = "";
    // String str2 = null;
    // System.out.println(str.length());
    // if (str.equals(str2)) {
    //   System.out.println("blank");
    // } else {
    //   System.out.println("null!");
    // }
    // 結果
    // 0
    // null!

    // 問題10-15
    // A a = new A(10);
    // B b = new B(10);
    // System.out.println(a.equals(b));

    // 10-14
    // List<String> list = new ArrayList<>();
    // list.add("Hello");
    // System.out.println(list.get(1));
    

    // 10-13
    // System.out.println(args[0].length());

    // 試した
    // // System.out.println(args.length()); // エラー
    // System.out.println(args.length);
    // String str = "abcde";
    // System.out.println(str.length());
    // String str2 = "abcde";
    // // System.out.println(str.length); // エラー
    // int[] args2 = {};
    // System.out.println(args2.length);
    // // System.out.println(args2.length()); // エラー

    // 10-9
    // try {
    //   try {
    //     String[] array = {"A", "B", "C"};
    //     System.out.println(array[3]);
    //   } catch (ArrayIndexOutOfBoundsException e) {
    //     System.out.println("D");
    //   } finally {
    //     System.out.println("E");
    //   }
    // } catch (ArrayIndexOutOfBoundsException e) {
    //   System.out.println("F");
    // } finally {
    //   System.out.println("G");
    // }

    // 10-8
    // try {
    //   System.out.println("A");
    // } finally {
    //   System.out.println("B");
    // } finally {
    //   System.out.println("C");
    // }

    // 試した
    // try {
    // System.out.println("A");
    // } finally {
    //     System.out.println("B");
    // }
    // // 別のtry文を追加する場合（必要に応じて）
    // try {
    //     // 何かの処理
    // } finally {
    //     System.out.println("C");
    // }
    // 結果、ABC

    // 10-6 10-7 private()
    // int result = sample();
    // System.out.println(result);


    // 10-5 privateメソッド有り
    // System.out.println(test(null));

    // 試した
    // String obj = null;
    // System.out.println(obj.toString());
    

    // 10-4
    // try {
    //   Object obj = null;
    //   System.out.println(obj.toString());
    //   System.out.println("A");
    // } finally {
    //   System.out.println("B");
    // } catch (NullPointerException e) {
    //   System.out.println("C");
    // }

    // 試した
    // Object obj = null;
    // System.out.println(obj.toString());
    // NullPointerException

    // 正しくは
    // try {
    //   Object obj = null;
    //   System.out.println(obj.toString());
    //   System.out.println("A");
    // } catch (NullPointerException e) {
    // System.out.println("C");
    // } finally {
    //   System.out.println("B");
    // }

    // 10-3 privateメソッドあり
    // try {
    //   sample();
    //   sub();
    // } catch (SampleException e) { // 親クラス
    //   System.out.println("A");
    // } catch (SubSampleException e) { // 子クラス
    //   System.out.println("B"); 
    // }

    // 試した
    // try {
    //   sub(); // 逆にした
    //   sample();
    // } catch (SampleException e) {
    //   System.out.println("A");
    // } catch (SubSampleException e) {
    //   System.out.println("B");
    // }
    // 結果同じエラー
    // Main.java:145: エラー: 例外SubSampleExceptionはすでに捕捉されています
    //     } catch (SubSampleException e) {
    //       ^
    // エラー1個
    // エラー: コンパイルが失敗しました

    // 試した
    // try {
    //   System.out.print("sample実行前！！");
    //   sample();
    //   System.out.println("sample実行後に");// これは実行されない
    //   sub();
    // } catch (SubSampleException e) {
    //   System.out.println("A");
    // } catch (SampleException e) {
    //   System.out.println("B");
    // }
    // 結果 sample実行前！！B

    // 10-2
    // try {
    //   if (args.length == 0) {
    //     System.out.println("A");
    //   }
    // } catch (NullPointerException e) {
    //   System.out.println("B");
    // } finally {
    //   System.out.println("C");
    // }

    // 試した
    // System.out.println(args);
    // System.out.println(args.length);
    // System.out.println(args.length == 0);
    // System.out.println(args[0]); // java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0

    // 10-1
    // try {
    //   int[] array = {};
    //   array[0] = 10;
    //   System.out.println("finish");
    // } catch (ArrayIndexOutOfBoundsException e) {
    //   System.out.println("error");
    // }

    // 試した
      // int[] array = {};
      // array[0] = 10;
      // 実行時例外エラー
      // System.out.println(array.length);

    // 試した
    // int[] array = new int[]{ 2, 3 };
    // array[0] = 10;
    // System.out.println(array[0]);
    // System.out.println(array[1]);
  }

  // 10-7
  // private static int sample() {
  //   int val = 0;
  //   try {
  //     String[] array = {"A", "B", "C"};
  //     System.out.println(array[3]);
  //   } catch (RuntimeException e) {
  //     val = 10;
  //     System.out.println(val + "  catchで ");
  //     return val;
  //   } finally {
  //     val += 10;
  //     System.out.println(val + "  finallyで");
  //   }
  //   return val;
  // }

  // 試した
  // private static int sample() {
  //   int val = 0;
  //   try {
  //     String[] array = {"A", "B", "C"};
  //     System.out.println(array[3]);
  //   } catch (RuntimeException e) {
  //     val = 10;
  //     System.out.println(val + "  catchで");
  //     return val;
  //   } finally {
  //     val += 10000;
  //     System.out.println(val + "  finallyで");
  //     return val;
  //   }
  //   // System.out.println(val + "  tryブロック外で");
  //   // return val;
  // }

  // 10-6
  // private static int sample() {
  //   try {
  //     throw new RuntimeException();
  //   } catch (RuntimeException e) {
  //     System.out.println("catch");
  //     return 10;
  //   } finally {
  //     System.out.println("finally");
  //     return 20;
  //   }
  // }

  // 10-5
  // private static String test(Object obj) {
  //   try {
  //     System.out.println(obj.toString());
  //   } catch (NullPointerException e) {
  //     return "A!";
  //   } finally {
  //     System.out.println("B");
  //   }
  //   return "C";
  // }

  // 試した
  // private static String test(Object obj) {
  //   try {
  //     System.out.println(obj.toString());
  //   } catch (NullPointerException e) {
  //     System.out.println("--catchブロックのreturn前");
  //     // return "A  --catchブロックのreturn";
  //   } finally {
  //     System.out.println("B  --finallyブロックのprintln");
  //     return "finallyのreturn";
  //   }
  //   return "C";
  // }

  // 10-3
  // private static void sample() throws SampleException {
  //   throw new SampleException();
  // }

  // private static void sub() throws SubSampleException {
  //   throw new SubSampleException();
  // }
}
