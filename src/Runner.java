import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Book book1 = new ProgrammingBook("01","1",12,"1","qưe","àd");
        Book book3 = new ProgrammingBook("03","2",121,"1","áds","ádfs");
        Book book4 = new ProgrammingBook("04","3",122,"1","sdafs","sdfds");
        Book book2 = new ProgrammingBook("02","1",12,"1","ádf","sadfsd");
        books.add(book1);
        books.add(book3);
        books.add(book4);
        books.add(book2);
        ManagerBook tester = new ManagerBook(books);
        tester.menuBook();

    }
}
