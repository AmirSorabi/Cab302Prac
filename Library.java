import java.util.ArrayList;
public class Library {

    private ArrayList<Book> books = new ArrayList<Book>();

    //adding book method
    public void addBook(Book book){
        books.add(book);
        System.out.println("Book succesffully added into library.");

    }


    // showing all book inoframtion in here
    public void showAllBooks(){
        for(Book book :books){
            book.DisplayInfo();
        }
    }


    //borrow book
    public void BorrowBook(String title){
        for(Book book : books){
            if(book.getTitle().equals(title)){
                book.BorrowBook();

            }


        }System.out.println("unable to find the books title");
    }

    /// returning
    public void returnBook(String title){
        for(Book book : books){
            if(book.getTitle().equals(title)){
                book.BorrowBook();

            }
        }System.out.println("unable to find the books title");
    }
}
