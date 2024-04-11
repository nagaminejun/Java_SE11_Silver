public interface A {
  public void Test();
}

// 試した
// public class A {}
// 結果
// B.java:1: エラー: ここにインタフェースが必要です
// public abstract class B implements A {}
//                                    ^
// Main.java:6: エラー: 不適合な型: CをAに変換できません:
//     A[] array = { new C(), null, new D() };
//                   ^
// Main.java:6: エラー: 不適合な型: DをAに変換できません:
//     A[] array = { new C(), null, new D() };
//                                  ^
// エラー3個
