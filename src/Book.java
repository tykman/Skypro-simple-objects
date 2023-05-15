public class Book {
   private final String bookName;
   private int publishingYear;

   public Book( String bookName, int publishingYear) {
      this.bookName = bookName;
      this.publishingYear = publishingYear;
   }

   public String getBookName() {
      return this.bookName;
   }

   public int getPublishingYear() {
      return this.publishingYear;
   }

   public void setPublishingYear(int publishingYear) {
      this.publishingYear = publishingYear;
   }
}