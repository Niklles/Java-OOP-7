package src.tasks.task4;

import src.tasks.task4.model.*;

public class task4 {
    public static void Execute() {
        Reader human1 = new Reader("tom tom tom", "123123", "faculty", "01.01.1000", "+79999999999");
        Reader human2 = new Reader("sam sam sam", "124124", "faculty", "02.01.1000", "+79999999998");
        Reader human3 = new Reader("kate kate kate", "125125", "faculty", "03.01.1000", "+79999999997");
        Reader[] table = new Reader[] {human1, human2, human3};
        Book book1 = new Book("Энциклопедия", "Tom F.F.");
        Book book2 = new Book("Приключения", "Sam H.H.");
        Book book3 = new Book("Словарь", "Kate D.D.");
        Book [] books = new Book[] {book1, book2, book3};

        
        human1.takeBook(book1, book2, book3);
        

    }
}
