public class Main {
  public static void main(String[] args) {
    System.out.println();

    // 7-21
    // new Child("D");

    // 7-20
    // A a = new B();

    // 7-19
    // Child child = new Child();
    // child.name = "sample";
    
    // 試した
    // System.out.println(child.getName());
    // System.out.println(child.name);
    // Parent child2 = child; // アップキャスト
    // child.name = "AAA";
    // System.out.println(child2.name);

    // 7-19でthisを理解するために
    // B b = new B();
    // b.printNum();
    // System.out.println(b + " Mainで");

    // 7-18
    // Sample s = new Sample(10);
    // System.out.println(s.getNum());

    // 試した
    // Sample ss = new Sample();
    // ss.setNum(10);
    // System.out.println(ss.getNum());
    // 結果、コンパイルエラー
    // エラー: クラス Sampleのコンストラクタ Sampleは指定された型に適用できません。
    // Sample ss = new Sample();
    //             ^

    // 7-17
    // A a = new A();
    // B b = (B) a;
    // b.hello();
    // 結果、実行時エラー
    // Exception in thread "main" java.lang.ClassCastException: class A cannot be cast to class B (A and B are in unnamed module of loader 'app')
    //     at Main.main(Main.java:7)

    // 試した
    // A a = new B();
    // B b = (B) a;
    // b.hello();

    // A a = new B();
    // // B a = new B();
    // a.hello();
    // a.test(); // A a = new B();の場合はエラー

    // B b = new B();
    // A a = b;
    // a.hello();

    // 7-16 helloと出力したい
    // A a = new B();
    //
    // b.hello();


    // 7-15 実行結果は
    // A[] array = {
    //   new B(),
    //   new C(),
    //   new A(),
    //   new D(),
    // };
    // エラー: 不適合な型: DをAに変換できません:

    // 試した、以下もダメ
    // A d = new D();
    // A[] array = {
    //   new E() // エラー: Eはabstractです。インスタンスを生成することはできません
    // };

    // 7-14
    // Worker a = new Engineer();
    // Employee b = new Engineer();
    // Engineer c = new Engineer();
    // a.create();
    // b.work();
    // c.report();

    // 試した、a.create();を機能させるためには
    // Engineer.javaにimplements Workerを追加、
    // Worker.java にcreate();実装なしを追加、それに伴い、Employee.javaに実装なしのpublic void create() {}を追加

    // 7-13
    // Worker worker = new Engineer();
    // worker.work();

    // 7-11
    // A a = new A();
    // A b = new B();
    // System.out.print(a.val);
    // System.out.print(b.val);
    // a.print();
    // b.print();

    // A b = new B();のアップキャストを理解するために
    // A b = new B();
    // A b = new B();
    // b.methodA();
    // b.methodC();
    // b.methodB(); // // コンパイルエラー: methodB() は A のメンバではない、もし呼び出したい場合はキャストする
    // ((B) b).methodB();

    // 7-9
    // AbstractSample s = new ConcreteSample();
    // s.sample();

    // 7-6
    // A a = new C();
    // a.sample();

    // 7-5
    // A a = new B();
    // System.out.println(a);
    /* 結果
    A.java:15: エラー: インタフェース Aのデフォルト・メソッドtoStringはjava.lang.Objectのメンバーをオーバーライドします
      default String toString() {
                    ^
    エラー1個 */

    // 試した
    // A a = new B();
    // System.out.println(a.toString2());


    // 7-4
    // A a = new B();
    // a.sample();
    // 答え インターフェイスクラスのメソッドに、java8から導入された default 修飾子が必要
  }
}


// 7-7
// public class Main implements A,B {
//   public static void main(String[] args) {
//     new Main().test();
//   }
//   // 結果、コンパイルエラー
// // Main.java:2: エラー: タイプAとBは互換性がありません。
// // public class Main implements A, B {
// //        ^
// //   クラス Mainは型AとBからtest()の関連しないデフォルトを継承します
// // エラー1個

// // 解決案1 implementsを一つに指定、Aクラスのtest()を呼び出し指定する
// // public class Main implements A {

// // 解決案2 A,Bの指定はそのままに、Mainクラス内でtest()をオーバーライドし、AかBどちらのtest()を呼び出すか指定する
//   @Override
//   public void test() {
//     A.super.test();  // Aのdefaultメソッドを呼び出す
//   }
// }
