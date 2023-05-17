public class Book {
   private final Author author;
   private final String bookName;
   private int publishingYear;

   public Book( String bookName,Author  author, int publishingYear) {
      this. author = author;
      this.bookName = bookName;
      this.publishingYear = publishingYear;
   }

   public Author getAuthor() {return this.author;}

   public String getBookName() {return this.bookName;}

   public int getPublishingYear() {
      return this.publishingYear;
   }

   public void setPublishingYear(int publishingYear) {
      this.publishingYear = publishingYear;
   }
}