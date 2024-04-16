//   問題7-1 以下のクラスが継承しているParentクラスの説明で正しいものはどれ、

public class Child extends Parent {

  // 7-21
  public Child() {
    super("B");
    System.out.println("C");
  }

  public Child(String val) {
    this();
    System.out.println(val);
  }
// 



  // 7-19
  // public String name;

  // Child() {
  //   name = "java";
  // }
  // void hello(){
  //   System.out.println("hello, " + name);
  // }
}
