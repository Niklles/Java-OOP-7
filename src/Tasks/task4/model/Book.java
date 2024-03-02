package src.tasks.task4.model;

public class Book {

    private String author;

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    private String nameBook;

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getNameBook() {
        return nameBook;
    }

    public Book(String nameBook, String author) {
        this.author = author;
        this.nameBook = nameBook;
    }
}
