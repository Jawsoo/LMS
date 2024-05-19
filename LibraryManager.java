import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Josue Suazo
 * Course: Software Development I CEN-3024C
 * Date: 05-19-2024

 * LibraryManager Class
 * This class manages the collection of books in the library.
 * It provides the ability to add, remove, and list books.
 */
class LibraryManager {
    private final ArrayList<Book> collection;

    /**
     * Constructor for the LibraryManager class.
     * Sets up the collection of books.
     */
    public LibraryManager() {
        collection = new ArrayList<>();
    }

    /**
     * Adds a new book to the collection.
     *
     * @param id     Unique identifier for the book.
     * @param title  Title of the book.
     * @param author Author of the book.
     */
    public void addBook(int id, String title, String author) {
        for (Book book : collection) {
            if (book.getId() == id) {
                System.out.println("A book with the same ID already exists.");
                return;
            }
        }
        collection.add(new Book(id, title, author));
    }

    /**
     * Removes a book from the collection using its ID.
     *
     * @param id ID of the book to be removed.
     */
    public void removeBook(int id) {
        for (Book book : collection) {
            if (book.getId() == id) {
                collection.remove(book);
                return;
            }
        }
        System.out.println("Book not found.");
    }

    /**
     * Lists all books currently in the collection.
     */
    public void listAllBooks() {
        if (collection.isEmpty()) {
            System.out.println("No books in the collection.");
            return;
        }
        for (Book book : collection) {
            System.out.println(book);
        }
    }

    /**
     * Reads book details from a text file and adds them to the collection.
     *
     * @param fileName Name of the text file containing book details.
     * Note: for this assignment the text file name is Books, so input Books.txt in the console when asked.
     */
    public void readFromFile(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] details = line.split(",");
                int id = Integer.parseInt(details[0].trim());
                String title = details[1].trim();
                String author = details[2].trim();
                addBook(id, title, author);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
