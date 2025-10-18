package LW_5.Q1;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Sujatha Thilaka",true,"9789553023975", "Seena Maragatham");
        Book book2 = new Book("Seynamasasekaka",true, "9789553548721", "Nuramakadya Bauthika Nuladanayakshanamaala");
        Book book3 = new Book("Sujatha Thilaka",true,"9781616953623",  "Island of a Thousand Mirrors");

    Library FCTLibrary = new Library();

    FCTLibrary.addLibraryItem(book1);
    FCTLibrary.addLibraryItem(book2);
    FCTLibrary.addLibraryItem(book3);
    System.out.println("--------------------------------------------------");
    FCTLibrary.displayInformation();
    System.out.println("--------------------------------------------------");
    FCTLibrary.listAvailableItems();
    System.out.println("--------------------------------------------------");
    FCTLibrary.checkOutBorrowableItem("Island of a Thousand Mirrors");
    System.out.println("--------------------------------------------------");
    FCTLibrary.listAvailableItems();

    }
}
