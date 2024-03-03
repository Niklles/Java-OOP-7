package src.tasks.task4.model;

public class Reader {
    private String fullName;

    public String getFullName() {
        return fullName;
    }

    private String serviceNumber;

    public String getServiceNumber() {
        return serviceNumber;
    }

    private String faculty;

    public String getFaculty() {
        return faculty;
    }

    private String birthDay;

    public String getBirthDay() {
        return birthDay;
    }

    private String phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    private Book[] books;

    public Book[] getBooks() {
        return books;
    }

    public Reader(String fullName, String serviceNumber, String faculty, String birthDay, String phoneNumber) {
        this.fullName = fullName;
        this.serviceNumber = serviceNumber;
        this.faculty = faculty;
        this.birthDay = birthDay;
        this.phoneNumber = phoneNumber;
    }

    public void takeBook() {
        System.out.printf("%s: взял книгу", fullName);
    }

    public void returnBook() {

    }

    public void takeBook(int countBook) {
        System.out.printf("%s: взял(а) %d книги", fullName, countBook);
    }

    public void takeBook(String... bookNames) {
        String names = new String();
        for (String bookName : bookNames) {
            names += bookName + ", ";
        }
        System.out.printf("%s взял книги: %s\n", fullName, names.substring(0, names.length() - 3));
    }

    public void takeBook(Book... titleBooks) {
        String title = new String();
        for (Book titleBook : titleBooks) {
            title += titleBook.getNameBook() + " " + titleBook.getAuthor() + ", ";
            System.out.printf("%s взял книги: %s\n", fullName, title.substring(0, title.length() - 3));
        }
        books = titleBooks;
    }

    public void displayBooks() {
        String book = new String();
        for (Book a : books) {
            book += a.getNameBook() + " " + a.getAuthor() + ", ";
        }
        System.out.printf("%s положил дома книги: %s", fullName, book.substring(0, book.length() - 2));
    }
}