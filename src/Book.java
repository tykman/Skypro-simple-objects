import java.util.Objects;

public class Book {
   private final Author author;


   private final String bookName;
   private int publishingYear;

   public Book( String bookName,Author  author,  int publishingYear) {
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

   @Override
   public String toString() {
      return "Book{" +
              "название книги - '" + bookName + '\'' +
              '}';
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Book book = (Book) o;
      return publishingYear == book.publishingYear && Objects.equals(bookName, book.bookName);
   }

   @Override
   public int hashCode() {
      return Objects.hash(bookName, publishingYear);
   }
}

