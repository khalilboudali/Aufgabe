// Main.java
public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "9780061120084");
        Book book3 = new Book("1984", "George Orwell", "9780451524935");

        Library library = new Library(5);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        System.out.println("All books in the library:");
        library.showLibraryBooks();

        System.out.println("Comparing books:");

        Book[] allBooks = {book1, book2, book3};

        for (int i = 0; i < allBooks.length; i++) {
            for (int j = i + 1; j < allBooks.length; j++) {
                boolean sameISBN = Book.compareBooks(allBooks[i], allBooks[j]);
                System.out.println(allBooks[i].getTitle() + " and " + allBooks[j].getTitle() + " have same ISBN: " + sameISBN);
            }
        }
    }
}


