public class Example2 {

    public static int num = 0;

    public void instanceMethod() {
        staticMethod();  // static メソッドを直接呼び出せる
        System.out.println("This is an instance method.");
    }

    public static void staticMethod() {
        // instanceMethod(); // エラー: staticでないメソッド instanceMethod()をstaticコンテキストから参照することはできません
        System.out.println("This is a static method.");
    }

    public static void main(String[] args) {
        Example2 ex = new Example2();
        Example2 ex2 = new Example2();
        ex.instanceMethod();  // 出力: This is a static method. / This is an instance method.
        ex.num += 10;
        ex2.num += 10;
        System.out.println(Example2.num);
    }
}
