
public class Main {
    public static void main(String[] args) {


        Library library = new Library();
        Book book1 = new Book("Pseudo", " Amir");
        Book book2 = new Book("Pschycomachia", "Arsalan");
        library.addBook(book1);
        library.addBook(book2);
        library.showAllBooks();


    }
}