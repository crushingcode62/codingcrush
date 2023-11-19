import java.util.ArrayList;

class Book {
    private String title;
    private String author;
    private String ISBN;

    // Constructor to initialize title, author, and ISBN
    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    // Getter methods
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }
}

class BookCollection {
    private ArrayList books;

    // Constructor to initialize the collection
    public BookCollection() {
        this.books = new ArrayList<>();
    }

    // Method to add a book to the collection
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added to the collection: " + book.getTitle());
    }

    // Method to remove a book from the collection
    public void removeBook(Book book) {
        if (books.remove(book)) {
            System.out.println("Book removed from the collection: " + book.getTitle());
        } else {
            System.out.println("Book not found in the collection: " + book.getTitle());
        }
    }

    // Method to display the books in the collection
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("The collection is empty.");
        } else {
            System.out.println("Books in the collection:");
            for (Book book : books) {
                System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", ISBN: " + book.getISBN());
            }
        }
    }
}

public class BookExample {
    public static void main(String[] args) {
        // Create an instance of BookCollection
        BookCollection myLibrary = new BookCollection();

        // Create instances of Book
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "978-3-16-148410-0");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "978-0-06-112008-4");

        // Add books to the collection
        myLibrary.addBook(book1);
        myLibrary.addBook(book2);

        // Display books in the collection
        myLibrary.displayBooks();

        // Remove a book from the collection
        myLibrary.removeBook(book1);

        // Display updated collection
        myLibrary.displayBooks();
    }
}
   