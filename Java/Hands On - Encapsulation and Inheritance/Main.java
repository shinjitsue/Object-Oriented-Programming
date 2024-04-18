import java.util.ArrayList;
import java.util.List;

class Book {
    // instance variables
    private String title;
    private String author;
    private String isbn;
    private String genre;
    private boolean availability;

    // constructor
    public Book(String title, String author, String isbn, String genre) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.genre = genre;
        this.availability = true;
    }

    // getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    // methods
    public boolean isAvailable() {
        return availability;
    }

    public void checkout() {
        this.availability = false;
    }

    public void returnBook() {
        this.availability = true;
    }
}

class Library {
    // instance variables
    private List<Book> books;

    // constructor
    public Library() {
        this.books = new ArrayList<>();
    }

    // methods
    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void displayAvailableBooks() {
        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println(book.getTitle());
            }
        }
    }
    public void displayCheckedOutBooks() {
        for (Book book : books) {
            if (!book.isAvailable()) {
                System.out.println(book.getTitle());
            }
        }
    }
}

class User {
    // instance variables
    private String name;
    private String id;
    private List<Book> checkedOutBooks;

    // constructor
    public User(String name, String id) {
        this.name = name;
        this.id = id;
        this.checkedOutBooks = new ArrayList<>();
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // methods
    public List<Book> getCheckedOutBooks() {
        return checkedOutBooks;
    }

    public void checkoutBook(Book book) {
        book.checkout();
        checkedOutBooks.add(book);
    }

    public void returnBook(Book book) {
        book.returnBook();
        checkedOutBooks.remove(book);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a new library
        Library library = new Library();
        // Create a new user
        User user = new User("John Doe", "123");
        // Create new books
        Book book1 = new Book("Title1", "Author1", "ISBN1", "Genre1");
        Book book2 = new Book("Title2", "Author2", "ISBN2", "Genre2");
        // Add books to the library
        library.addBook(book1);
        library.addBook(book2);
        // Display available books
        user.checkoutBook(book1);
        user.returnBook(book1);
        // Display checked out books
        library.displayAvailableBooks();
        library.displayCheckedOutBooks();
    }
}