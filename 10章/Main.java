// import java.util.ArrayList;
// import java.util.List;

public class Main {
  public static void main(String[] args) {
    System.out.println();

    // 問題10-17 
    main(args);

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
    // } catch (SampleException e) {
    //   System.out.println("A");
    // } catch (SubSampleException e) {
    //   System.out.println("B");
    // }

    // 試した
    // try {
    //   sample();
    //   sub();
    // } catch (SubSampleException e) {
    //   System.out.println("A");
    // } catch (SampleException e) {
    //   System.out.println("B");
    // }
    // 結果 B

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

    // 10-1
    // try {
    //   int[] array = {};
    //   array[0] = 10;
    //   System.out.println("finish");
    // } catch (ArrayIndexOutOfBoundsException e) {
    //   System.out.println("error");
    // }

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
  //     System.out.println(val + "  catchで");
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
  //     val += 10;
  //     System.out.println(val + "  finallyで");
  //     return val; // 基本finallyブロックでreturnは非推奨
  //   }
  //   return val; // 上記のreturn記述すると左記returnが到達不能でエラーになる。解消案はどちらか記述しないこと、
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
  //     return "A";
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
  //     System.out.println("--catchブロックのprintln");
  //     return "A  --catchブロックのreturn";
  //   } finally {
  //     System.out.println("B  --finallyブロックのprintln");
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
