public class Book {
   private final String bookName;
   private String authorName;
   private int publishingYear;

   public Book( String bookName, int publishingYear) {
      this.bookName = bookName;
      this.authorName = authorName;
      this.publishingYear = publishingYear;
   }

   public String getBookName() {
      return this.bookName;
   }

   public String getAuthorName() {return this.authorName;}

   public int getPublishingYear() {
      return this.publishingYear;
   }

   public void setPublishingYear(int publishingYear) {
      this.publishingYear = publishingYear;
   }
}