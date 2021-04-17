import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<>();
        ManagerBook tester = new ManagerBook(books);
        tester.menuBook();
    }
}
