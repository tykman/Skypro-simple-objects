public class Main {
    public static void main(String[] args) {
        Author author = new Author("Михаил Булгаков");
        Book  book1  = new Book("Мастер и Маргарита" , author, 1966);
        System.out.println("=== === === ===");
        System.out.println("автор книги = " + author.getAuthor());
        System.out.println("название книги = " + book1.getBookName());
        book1.setPublishingYear(1967);
        System.out.println("год публикации = " + book1.getPublishingYear());

        System.out.println("=== === === ===");
        Author  author1 = new Author("Шарль Перро");
        Book book2 =  new Book( "Кот в сапогах", author, 1695);
        System.out.println("автор книги = " + author1.getAuthor());
        System.out.println("название книги = " + book2.getBookName());
        System.out.println("год публикации = " + book2.getPublishingYear());
        System.out.println("=== === === ===");
    }
}