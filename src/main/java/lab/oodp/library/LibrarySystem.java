package lab.oodp.library;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class LibrarySystem{
    public void start(){
          //TODO: Define an ArrayList named  bookList to store Book objects
          List<Book> bookList = new ArrayList<>();

          //TODO: Define an ArrayList named  CdsList to store CDs objects
          List<CDs> CdsList = new ArrayList<>();
         
  
  
          //TODO: Remove the comments from the code below
          bookList.add(new Book("To Kill a Mockingbird","John Doe", "978-0061120084", Status.AVAILABLE));
          bookList.add(new Book("1984","George Orwell", "978-0451524935", Status.AVAILABLE));
          bookList.add(new Book("The Great Gatsby","F. Scott Fitzgerald", "978-0743273565", Status.AVAILABLE));
  
          CdsList.add(new CDs("Thriller", "Michael Jackson", "Pop", Status.AVAILABLE) );
          CdsList.add(new CDs("The Dark Side of the Moon", "Pink Floyd", "Rock", Status.AVAILABLE) );
          CdsList.add(new CDs("Abbey Road", "The Beatles", "Rock", Status.AVAILABLE) );
  
                
          System.out.println("Displaying all books sorting from book titles");
          //Todo: Sort books based on the book title using Collections.sort().
          Collections.sort(bookList);
  
          displayBookItems(bookList);
          
          System.out.println("*************************************");
          
          
          System.out.println("Displaying all CDs sorting from Cds Artist");
          //Todo: Sort Cds based on the artist using Collections.sort().
          Collections.sort(CdsList);
  
          displayCDItems(CdsList);

    }
   

    public static void main(String[] args) {
        new LibrarySystem().start();
        
     
    }

    public static void displayCDItems(List<CDs> CDsitems){
        for (CDs item : CDsitems) {
            System.out.println(item);
        }
    }

    public static void displayBookItems(List<Book> bookitems){
        for (Book item : bookitems) {
            System.out.println(item);
        }
    }


}
