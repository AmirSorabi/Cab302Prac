public class Book {
    private String title;
    private String author;
    private boolean isBorrowed;





    // the construction for our clas is comes in here

    public Book(String title, String author){
        this.title = title;
        this.author = author;
        isBorrowed = false;
    }




///  getters
    public String getTitle(){
        return title;
    }


    public String getAuthor(){
        return author;
    }


    public boolean isBorrowed(){
        return isBorrowed;
    }



/// / user barroweing book
    public void BorrowBook(){
        if(!isBorrowed){
            System.out.println("Book successfully borrowed.");
            isBorrowed = true;
        }
        else{
            System.out.println("sorry! book already has been borrowed");
        }
    }

    /// user returning book
    public void RetrunBook(){
        if(isBorrowed){
            System.out.println("Book has been successfully returned.");
            isBorrowed = false;

        }
        else{
            System.out.println("sorry! the book has not been borrowed.");
        }
    }


    //getting books information
    public void DisplayInfo(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Borrowed: " + (isBorrowed ? "Yes" : "No"));
        System.out.println("------------------------");
    }



}

