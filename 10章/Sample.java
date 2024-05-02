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

// // 10-10
// import java.io.FileInputStream;
// import java.io.FileNotFoundException;

// public class Sample {
//   public static void main(String[] args) {
//     try (FileInputStream is = new FileInputStream("sample.text")) {
//       System.out.println(is);
//       // throw new FileNotFoundException(); // 強制的に例外をスロー
//     } catch (Exception e) {
//       System.out.println("A");
//     } finally {
//       if (is != null) {
//         is.close();
//       }
//       System.out.println("B");
//     }
//   }
// }
