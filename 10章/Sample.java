// 10-11
// public class Sample {
//   // ??? 部分に記述する実装２つ
//   // public void hello(String name) ??? {
//   public void hello(String name) throws SampleException, TestException {
//     if (name == null) {
//       throw new SampleException();
//     }
//     if ("".equals(name)) {
//       throw new TestException();
//     }
//     // do something
//   }
// }

// 試した
// public class Sample {
//   // ??? 部分に記述する実装２つ
//   // public void hello(String name) ??? {
//   public void hello(String name) throws TestException {
//     if (name == null) {
//       throw new SampleException();
//     }
//     if ("".equals(name)) {
//       throw new TestException();
//     }
//     // do something
//   }
// }

// // 10-10
// import java.io.FileInputStream;
// import java.io.FileNotFoundException;

// public class Sample {
//   public static void main(String[] args) {
//     try (FileInputStream is = new FileInputStream("sample.text")) {
//       System.out.println(is);
//       throw new FileNotFoundException(); // 強制的に例外をスロー
//     } catch (Exception e) {
//       System.out.println("A");
//     } finally {
//       if (is != null) { // 左記のif文、isへのアクセスがエラー
//         is.close();// 
//       } //
//       System.out.println("B");
//     }
//   }
// }

// 試した Java 7以前の古いスタイル
// public class Sample {
//   public static void main(String[] args) {
//     FileInputStream is = null;
//     try (is = new FileInputStream("sample.text")) {
//       System.out.println(is);
//       throw new FileNotFoundException(); // 強制的に例外をスロー
//     } catch (Exception e) {
//       System.out.println("A");
//     } finally {
//       if (is != null) { // 左記のif文、isへのアクセスがエラー
//         is.close();// 
//       } //
//       System.out.println("B");
//     }
//     // 結果、エラー
//     // Sample.java:40: エラー: try-with-resourcesリソースは、final変数または事実上のfinal変数への参照を示す変数宣言または式である必要があります
//     //     try (is = new FileInputStream("sample.text")) {
//     //             ^
//     // エラー1個
//   }
// }

// Java 7以前の典型的なパターン
// import java.io.FileInputStream;
// import java.io.FileNotFoundException;
// import java.io.IOException;

// public class Sample {
//   public static void main(String[] args) {
//     FileInputStream is = null;
//     try {
//       is = new FileInputStream("sample.text");
//       System.out.println(is);
//       throw new FileNotFoundException(); // 強制的に例外をスロー
//     } catch (IOException e) {
//       System.out.println("A");
//     } finally {
//       if (is != null) {
//         try {
//           is.close();
//         } catch (IOException e ) {
//           throw new RuntimeException();
//         }
//       }
//     }
//   }
//     // 結果、エラー
//     // Sample.java:40: エラー: try-with-resourcesリソースは、final変数または事実上のfinal変数への参照を示す変数宣言または式である必要があります
//     //     try (is = new FileInputStream("sample.text")) {
//     //             ^
//     // エラー1個
// }
