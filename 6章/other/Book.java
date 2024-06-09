package other;

// 6-27
public class Book {
  private String isbn;
  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  protected void printInfo() {
    System.out.println(isbn);
  }

  // public void printInfo() { // publicで試した
  //   System.out.println(isbn);
  // }

  // 練習用
  // public void printInfo2() {
  //   System.out.println("importを利用して表示");
  // }
}
