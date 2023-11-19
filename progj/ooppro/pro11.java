import java.util.ArrayList;

class Book {
    private String title;
    private String author;

    // Constructor to initialize title and author
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Getter methods
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}

class Library {
    private ArrayList books;

    // Constructor to initialize the collection of books
    public Library() {
        this.books = new ArrayList<>();
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added to the library: " + book.getTitle());
    }

    // Method to remove a book from the library
    public void removeBook(Book book) {
        if (books.remove(book)) {
            System.out.println("Book removed from the library: " + book.getTitle());
        } else {
            System.out.println("Book not found in the library: " + book.getTitle());
        }
    }

    // Method to display all books in the library
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("The library is empty.");
        } else {
            System.out.println("Books in the library:");
            for (Book book : books) {
                System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor());
            }
        }
    }
}

public class LibraryExample {
    public static void main(String[] args) {
        // Create an instance of the Library class
        Library myLibrary = new Library();

        // Create instances of the Book class
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");

        // Add books to the library
        myLibrary.addBook(book1);
        myLibrary.addBook(book2);

        // Display books in the library
        myLibrary.displayBooks();

        // Remove a book from the library
        myLibrary.removeBook(book1);

        // Display updated library
        myLibrary.displayBooks();
    }
}
  