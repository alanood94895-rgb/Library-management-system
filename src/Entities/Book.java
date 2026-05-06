package Entities;

public class Book  {
    String bookAuthor;

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookAuthor='" + bookAuthor + '\'' +
                '}';
    }
}
//aaaa