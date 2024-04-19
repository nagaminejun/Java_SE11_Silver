public class Person {
    private int age = 30;
    public static int count = 0;  // クラスレベルの変数（全インスタンスで共有）

    public Person() {
        count++;  // コンストラクタが呼ばれるたびにカウントをインクリメント
    }

    public int getAge() {
        System.out.println("Total instances: " + Person.count);
        return age;  // 非staticメソッド
    }

    public static int getCount() {
        return count;  // インスタンスを作成しなくてもアクセス可能
    }

    public static void displayInfo() {
        // System.out.println(age);  // これはコンパイルエラーになる
        // System.out.println(getAge());  // これもコンパイルエラーになる

        Person person = new Person();  // インスタンスを作成
        System.out.println(person.getAge());  // インスタンス経由で非staticメンバにアクセス
    }

    public static void main(String[] args) {
        System.out.println("Total instances: " + Person.count);
        System.out.println("Total instances: " + Person.getCount());
        Person person = new Person();
        new Person();
        new Person();
        System.out.println("Total instances: " + Person.getCount());  // インスタンスを作らないでメソッドを呼び出す
        System.out.println(person.getAge());  // 非staticメンバにアクセス
        displayInfo();
    }
}
