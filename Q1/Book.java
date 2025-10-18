package LW_5.Q1;

public class Book extends BorrowableItems{
    private String title;
    private  String author;
    private String ISBN;
    private boolean available;

    public Book(String author, boolean available, String ISBN, String title) {
        this.author = author;
        this.available = available;
        this.ISBN = ISBN;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean getAvailable() {
        return available;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void  displayInfo(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("ISBN: "+ISBN);
        System.out.println("Available: "+available);
    }
}
