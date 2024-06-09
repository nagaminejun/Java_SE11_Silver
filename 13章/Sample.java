// package test;

public class Sample {
  // 13-66
  public static void main(String[] args) {
    // int a;
    // System.out.println(a);
    Item[] items = new Item[3];
    System.out.println(items[0]);
    System.out.println(items[1]);
    System.out.println(items[2]);
    items[1] = new Item("A");
    items[2] = new Item("B");
    System.out.println(items[0]);
    for (Item item : items) {
      // System.out.println(item.name);
    }
  }

  // 13-21
  // private int num;
  // private int test() {
  //   for (int i = 0; i < 3; i++) {
  //     num += i;
  //   }
  //   return num;
  // }
  // public static void main(String[] args) {
  //   Sample s = new Sample();
  //   int num = s.test();
  //   s.test();
  //   System.out.println(num);
  //   System.out.println(s.num); //
  // }
  // int a;
  // private int b;
  // protected int c;
  // public int d;
} 
