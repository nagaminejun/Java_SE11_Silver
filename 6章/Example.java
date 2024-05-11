public class Example {
    public static void staticMethod1() {
        System.out.println("This is static method 1.");
    }

    public static void staticMethod2() {
        staticMethod1();  // 同じクラス内の static メソッドを直接呼び出し
        System.out.println("This is static method 2.");
    }

    public static void main(String[] args) {
        staticMethod2();  // 出力: This is static method 1. / This is static method 2.
    }
}
