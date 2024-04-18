public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("The Buknoy", "Bubuknoy", 123, false));
        library.addBook(new Book("Step Bro", "John Dings", 456, true));
        library.addBook(new Book("Avatar the legend of Miming", "Mr. Ren", 789, true));
        library.addBook(new Book("E.N.D", "Natsu Dragnell", 101112, true));
        library.addBook(new Book("Brobro", "Ney", 131415, false));

        Book[] foundBooks = library.searchByTitle("Avatar the legend of Miming");
        for (Book book : foundBooks) {
            System.out.println("Found book: " + book.getTitle() + ", Author: " + book.getAuthor() + ", ISBN: " + book.getIsbn() + ", Available: " + book.isAvailable());
            System.out.println();
        }

        library.listBooks();
    }
}