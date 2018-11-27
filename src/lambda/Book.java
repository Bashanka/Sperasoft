package lambda;

class Book {

    private String title;
    private Author author;
    private double price;

    public Book(String title, Author author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getAuthorFullName() {
        return author.authorsFullName();
    }

    public String bookDetails() {
        return author.authorsFullName() + " \"" + title + "\" - " + Double.toString(price);
    }

    public void printBookDetails() {
        System.out.println(bookDetails());
    }

    @Override
    public String toString() {
        return bookDetails();
    }
}
