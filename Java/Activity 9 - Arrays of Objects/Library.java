public class Library {
    private Book[] books;
    private int counter;

    public Library() {
        this.books = new Book[50];
        this.counter = 0;
    }

    public void addBook(Book book) {
        if (counter < books.length) {
            books[counter] = book;
            counter++;
        } else {
            System.out.println("The library full.");
        }
    }

    public Book[] searchByTitle(String title) {
        Book[] foundBooks = new Book[counter];
        int foundCount = 0;
        for (int i = 0; i < counter; i++) {
            if (books[i].getTitle().equals(title)) {
                foundBooks[foundCount] = books[i];
                foundCount++;
            }
        }
        return java.util.Arrays.copyOf(foundBooks, foundCount);
    }

    public void listBooks() {
        for (int i = 0; i < counter; i++) {
            System.out.println("Title: " + books[i].getTitle() + ", Author: " + books[i].getAuthor() + ", ISBN: " + books[i].getIsbn() + ", Available: " + books[i].isAvailable());
        }
    }
}