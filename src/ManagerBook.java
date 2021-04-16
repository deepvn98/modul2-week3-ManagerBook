import java.util.ArrayList;
import java.util.Scanner;

public class ManagerBook {
        private ArrayList<Book> books;

        public ArrayList<Book> getBooks() {
                return books;
        }

        public void setBooks(ArrayList<Book> books) {
                this.books = books;
        }

        public ManagerBook(ArrayList<Book> books) {
                this.books = books;
        }

        public double getAmount() {
                double total = 0;
                for (Book o : books) {
                        total += o.getPrice() * books.size();
                }
                return total;
        }

        //        Thêm sách programmingbook
        public void addBookProgramming() {
                System.out.print("Nhập id sách: ");
                Scanner scanner = new Scanner(System.in);
                String id = scanner.nextLine();
                System.out.print("Nhập id sách: ");
                Scanner scanner1 = new Scanner(System.in);
                String name = scanner1.nextLine();
                System.out.print("Nhập id sách: ");
                Scanner scanner2 = new Scanner(System.in);
                double price = scanner2.nextDouble();
                System.out.print("Nhập id sách: ");
                Scanner scanner3 = new Scanner(System.in);
                String author = scanner3.nextLine();
                System.out.print("Nhập id sách: ");
                Scanner scanner4 = new Scanner(System.in);
                String language = scanner4.nextLine();
                System.out.print("Nhập id sách: ");
                Scanner scanner5 = new Scanner(System.in);
                String framework = scanner5.nextLine();
                Book programming = new ProgrammingBook(id, name, price, author, language, framework);
                books.add(programming);
        }

        //        Thêm sách fictorbook
        public void addBookFiction() {
                System.out.print("Nhập id sách: ");
                Scanner scanner = new Scanner(System.in);
                String id = scanner.nextLine();
                System.out.print("Nhập name sách: ");
                Scanner scanner1 = new Scanner(System.in);
                String name = scanner1.nextLine();
                System.out.print("Nhập Price sách: ");
                Scanner scanner2 = new Scanner(System.in);
                double price = scanner2.nextDouble();
                System.out.print("Nhập author sách: ");
                Scanner scanner3 = new Scanner(System.in);
                String author = scanner3.nextLine();
                System.out.print("Nhập category sách: ");
                Scanner scanner4 = new Scanner(System.in);
                String category = scanner4.nextLine();
                Book fictionBook = new FictionBook(id, name, price, author, category);
                books.add(fictionBook);
        }

        //        Thêm sách vào Book!
        public void addBook() {
                Scanner scanner = new Scanner(System.in);
                System.out.println(" mời bạn nhập sách bạn muốn thêm!");
                while (true) {
                        System.out.println("Nhấn 1:  nếu bạn muốn thêm sách programming! \n" + "Nhấn 2: nếu bạn muốn thêm sách fiction!\n" + "Nhấn 3: Hiển thị Tất cả Book!\n" + "Nhấn 4: nếu bạn muốn thoát!\n");
                        int input = scanner.nextInt();
                        switch (input) {
                                case 1:
                                        addBookProgramming();
                                        break;
                                case 2:
                                        addBookFiction();
                                        break;
                                case 3:
                                        showBook(books);
                                default:
                                        break;

                        }
                        if (input == 4) {
                                break;
                        }
                }


        }


        //        Xoá sách bằng cách tìm đến tên sách và xoá
        public void deleteBook() {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Nhập tên sách muốn xoá: ");
                String name = scanner.nextLine();
                for (int i = 0; i < books.size(); i++) {
                        if (books.get(i).getName().equals(name)) {
                                books.remove(books.get(i));
                        }
                }
        }
        //        Sửa Sách bằng cách nhập tên sách cũ và thay sách mới vào vị trí đó
        public void editBook() {
                Scanner scanner = new Scanner(System.in);
                System.out.println("nhập tên sách bạn muốn sửa: ");
                String name = scanner.nextLine();
                for (int i = 0; i < books.size(); i++) {
                        if (books.get(i).getName().equals(name) && books.get(i) instanceof ProgrammingBook) {
                                System.out.print("Nhập id sách mới: ");
                                Scanner scanner6 = new Scanner(System.in);
                                String id = scanner.nextLine();
                                System.out.print("Nhập id sách mới: ");
                                Scanner scanner1 = new Scanner(System.in);
                                String name1 = scanner1.nextLine();
                                System.out.print("Nhập id sách mới: ");
                                Scanner scanner2 = new Scanner(System.in);
                                double price = scanner2.nextDouble();
                                System.out.print("Nhập id sách mới: ");
                                Scanner scanner3 = new Scanner(System.in);
                                String author = scanner3.nextLine();
                                System.out.print("Nhập id sách mới: ");
                                Scanner scanner4 = new Scanner(System.in);
                                String language = scanner4.nextLine();
                                System.out.print("Nhập id sách mới: ");
                                Scanner scanner5 = new Scanner(System.in);
                                String framework = scanner5.nextLine();
                                Book programming = new ProgrammingBook(id, name1, price, author, language, framework);
                                books.set(i, programming);
                        } else if (books.get(i).getName().equals(name) && books.get(i) instanceof FictionBook) {
                                System.out.print("Nhập id sách: ");
                                Scanner scanner6 = new Scanner(System.in);
                                String id = scanner6.nextLine();
                                System.out.print("Nhập name sách: ");
                                Scanner scanner1 = new Scanner(System.in);
                                String name1 = scanner1.nextLine();
                                System.out.print("Nhập Price sách: ");
                                Scanner scanner2 = new Scanner(System.in);
                                double price = scanner2.nextDouble();
                                System.out.print("Nhập author sách: ");
                                Scanner scanner3 = new Scanner(System.in);
                                String author = scanner3.nextLine();
                                System.out.print("Nhập category sách: ");
                                Scanner scanner4 = new Scanner(System.in);
                                String category = scanner4.nextLine();
                                Book fictionBook = new FictionBook(id, name1, price, author, category);
                                books.set(i, fictionBook);
                        }
                }
        }
//Hiển thị thông tin sách
        public void showBook(ArrayList<Book> books) {
                for (Book o : books) {
                        System.out.println(o.toString());
                }
        }

}
