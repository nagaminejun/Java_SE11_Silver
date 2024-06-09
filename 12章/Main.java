import java.time.LocalDate;
import static java.time.DayOfWeek.*;
import java.util.List;
import java.util.ArrayList;

public class Main {
  // static String str; // 12-13用
  // static int xx; // 12-63 でテスト
  public static void main(String[] args) {
    System.out.println();

    // 12-74
    // String[] str = new String[2];
    // int i = 0;
    // for (String s : str) {
    //   str[i].concat("e" + i);
    //   i++;
    // }

    // 12-69
    // List<String> list = new ArrayList<>();
    // try {
    //   while(true) {
    //     list.add("hello");
    //   }
    // } catch (RuntimeException e) {
    //   System.out.println("A");
    // } catch (Exception e) {
    //   System.out.println("B");
    // }
    // System.out.println("C");
    // **** 実行すると無限ループで実行時エラー。以下の修正案ならいける。出力まで少し時間かかる。。。
    // } catch (Error e) {
    //   System.out.println("B");
    // }

    // 12-63
    // int x;
    // int y = 3;
    // if (y > 2) {
    //   x = ++y; // 初期化されてない
    //   y = x + 5;
    // } else {
    //   x = y;
    //   y++;
    // }
    // System.out.println(x); // コンパイルエラー、「初期化されない」という意味がわかりやすいかも、、もしelseならxは値がない。。

    // 12-50
    // int num = 0;
    // do {
    //   num++;
    //   if (num == 1) {
    //     continue;
    //   }
    //   System.out.println(num);
    // } while (num < 1);

    // 12-22
    // C c = new C();
    // c.getValue();

    // 12-21
    // int[] array = {0, 1};
    // int[][][] array2 = new int[2][2][2];
    // array2[0][0] = array;
    // array2[0][1] = array;
    // array2[1][0] = array;
    // array2[1][1] = new int[]{100, 200};
    // System.out.println(array2[0][0][0]);
    // System.out.println(array2[0][0][1]);
    // System.out.println(array2[1][1][0]);
    // System.out.println(array2[1][1][1]);

    // 12-19
    // A a = new B();
    // a.bye();

    // 12-16
    // LocalDate.now().with(TUESDAY).getDayOfWeek();
    // System.out.println(LocalDate.now());
    // System.out.println(LocalDate.now().with(TUESDAY));
    // System.out.println(LocalDate.now().with(TUESDAY).getDayOfWeek());

    // 12-52
    // int[] array1 = {1, 2, 3, 4, 5};
    // int[] array2 = {1, 2, 4, 5, 3};
    // int result1 = Arrays.mismatch(array1, array2);
    // int result2 = Arrays.compare(array1, array2);
    // System.out.println(result1 + "  " + result2);


    // 12-50
    // int num = 0;
    // do {
    //   num++;
    //   if (num == 1) {
    //     continue;
    //   }
    //   System.out.println(num);
    // } while (num < 1);

    // 12-13
    // switch(str) {
    //   case "10" : str += "10";
    // }

    // 12-12
    // String str = "abcd ef gh";
    // int x = str.indexOf("ef");
    // // System.out.println(x);
    // str.substring(x + 3);
    // x = str.indexOf("ef");
    // System.out.println(str + " " + x);
  }
}

// 12-13
// javac -d build ex15/Sample.java ex15/Main.java
// java -cp build ex15.Main

// short b = (short)'A';
