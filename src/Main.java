public class Main {
    public static void main(String[] args) {
        Author author = new Author("Михаил Булгаков" );
        Book book1 = new Book("Мастер и Маргарита",author,1966);
        System.out.println("автор книги -" + author.getAuthor());
        System.out.println("название книги - " + book1.getBookName());
        book1. setPublishingYear(1967);
        System.out.println("год публикации - " + book1.getPublishingYear());
        System.out.println("=== === ===");
        System.out.println(author);
        System.out.println(book1);
        System.out.println("=== === === ===");

        Author author1 = new Author("Михаил Булгаков");
        Book book2 =  new Book("Собачье сердце",author1 , 1925);
        System.out.println("автор - " + author.getAuthor());
        System.out.println("название книги - " + book2.getBookName());
        System.out.println("год публикации - " + book2.getPublishingYear());
        System.out.println("=== === === ===");
        System.out.println(author1);
        System.out.println(book2);
        System.out.println("=== === === ===");

        Author author2 = new Author("М.А.БУЛГАКОВ");
        Author author3 = new Author("М.А.БУЛГАКОВ");
        System.out.println(author2.equals(author3));
        System.out.println("=== === === ===");

        Book book3 = new Book("Я умный",author,2010);
        Book book4 = new Book("Я глупый",author,2011);
        System.out.println(book3.equals(book4));
        System.out.println("=== === === ===");

        System.out.println(book3.hashCode());
        System.out.println(book3.hashCode());
    }
}