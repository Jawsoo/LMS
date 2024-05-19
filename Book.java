/**
 * Josue Suazo
 * Course: Software Development I CEN-3024C
 * Date: 05-19-2024

 * Book Class
 * This class shows a book with a unique ID, title, and author.
 * It's used to store and retrieve information about books in the library.
 */
class Book {
    private final int id;
    private final String title;
    private final String author;

    /**
     * Constructor for the Book class.
     * @param id Unique identifier for the book.
     * @param title Title of the book.
     * @param author Author of the book.
     */
    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    /**
     * Getter for the book ID.
     * @return unique identifier of the book.
     */
    public int getId() {
        return id;
    }

    /**
     * Converts book details to a string format.
     * @return A string containing the book ID, title, and author.
     */
    @Override
    public String toString() {
        return id + ", " + title + ", " + author;
    }
}
