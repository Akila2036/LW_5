package LW_5.Q1;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> BorrowableItemsList = new ArrayList<>();


    public void addLibraryItem(Book borrowableItems) {
        BorrowableItemsList.add(borrowableItems);
    }

    public void checkOutBorrowableItem(String title){
        for (Book book:BorrowableItemsList ) {
            if (book.getTitle().equals(title) && book.getAvailable()) {
                System.out.println("The book you searched is available.");
                System.out.println("Checking Out: " + book.getTitle());
                book.setAvailable(false);
            }
        }

    }

    public void listAvailableItems(){
        System.out.println("Available books: ");
        for (Book book :BorrowableItemsList){
            if(book.getAvailable()){
                System.out.println(book.getTitle());
            }
        }
    }

    public void displayInformation(){
        int x =0;
        for (Book book :BorrowableItemsList){
            if(book.getAvailable()){
                x = x + 1;
            }
        }
        System.out.println("Number of Books Available: "+x);
    }


}
