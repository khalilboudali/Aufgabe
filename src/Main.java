// Main.java
public class Main {
    public static void main(String[] args) {
        // Create some Book objects
        Book book1 = new Book("Title 1", "Author 1", "ISBN1");
        Book book2 = new Book("Title 2", "Author 2", "ISBN2");
        Book book3 = new Book("Title 3", "Author 3", "ISBN3");

        // Instantiate the Library object
        Library library = new Library(5); // Assuming library can hold 5 books

        // Add books to the library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Display all books in the library
        library.showLibraryBooks();

        // Compare between 2 books using the static method
        System.out.println("Comparing books:");
        boolean sameIsbn = Book.compareBooks(book1, book2);
        System.out.println("Are book1 and book2 the same? " + (sameIsbn ? "Yes" : "No"));
    }
}


