// 9-19
// public class Item {
//   private int id;
//   private String name;
//   public Item(int id, String name) {
//     this.id = id;
//     this.name = name;
//   }
//   public int getId() {
//     return id;
//   }
//   public String getName() {
//     return name;
//   }
// }


// // 9-11
// public class Item {
//   private String name;
//   private int price;
//   public Item(String name, int price) {
//     this.name = name;
//     this.price = price;
//   }

//   public boolean equals(Object obj) {
//     // System.out.println(obj instanceof Item); // 試した
//     if (obj instanceof Item) {
//       Item tmp = (Item) obj;
//       if (tmp.name.equals(this.name) || tmp.price == this.price) {
//         return true;
//       }
//     }
//     return false;
//   }
//   public String getName() {
//     return name;
//   }
// }
