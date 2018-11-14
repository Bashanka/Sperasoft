package objectsbasics;

public class Practice1 {
}

class Author {

    public String firstName;
    public String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String authorsFullName() {
        return firstName + " " + lastName;
    }

    public void printAuthorsFullName() {
        System.out.println(authorsFullName());
    }

}

class Book {

    String title;
    Author author;
    double price;

    public Book(String title, Author author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String bookDetails() {
        return author.authorsFullName() + " \"" + title + "\" - " + Double.toString(price);
    }

    public void printBookDetails() {
        System.out.println(bookDetails());
    }

}