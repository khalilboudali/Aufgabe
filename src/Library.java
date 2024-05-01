public class Library {
    // Private array to hold Book objects
    private Book[] books;

    // Constructor to initialize the array
    public Library(int size) {
        books = new Book[size];
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                break;
            }
        }
    }

    // Method to display details of all books in the library
    public void showLibraryBooks() {
        for (Book book : books) {
            if (book != null) {
                book.displayDetails();
                System.out.println();
            }
        }
    }
}
