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

    public void takeBook (String... bookNames){
        String names = new String();
        for (String bookName : bookNames) {
            names += bookName + ", ";
        }
        System.out.printf("%s взял книги: %s", fullName, names.substring(0, names.length() - 2));
    }

    public void takeBook(Book... titleBooks) {
        String title = new String();
        for (Book titleBook : titleBooks){
            title += titleBook.getNameBook() + " " + titleBook.getAuthor() + ", ";
            System.out.printf("%s взял книги: %s", fullName, title.substring(0, title.length() - 2));
            }
            
        }
}
