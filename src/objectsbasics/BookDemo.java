package objectsbasics;

public class BookDemo {

    public static void main(String[] args) {
        Author author = new Author("Russel", "Winderand");
        Book book = new Book("Developing Java Software", author, 79.75);
        book.printBookDetails();
    }

}
