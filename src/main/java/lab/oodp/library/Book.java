package lab.oodp.library;



public class Book extends LibraryItem implements  Comparable<Book>{
   
    private String author;
    private String isbn;
   
     //TODO: Implement a constructor that takes 4 parameters ( title, author, isbn, status) to initialize their values.
    public Book(String title, String author, String isbn, Status status ) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.status = status;
    }
    
    @Override
    public String toString() {
        return "Book title:"+  title + " by " + author + "(ISBN:" + isbn + ")" + " Status:" + status;
    }

    //TODO: implement method compareTo(Book other) by comparing book title
    @Override
    public int compareTo(Book other) {
        return this.title.compareTo(other.title);
    }

   
}




