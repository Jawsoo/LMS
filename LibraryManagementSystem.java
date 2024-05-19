import java.util.Scanner;

/**
 * Josue Suazo
 * Course: Software Development I CEN-3024C
 * Date: 05-19-2024

 * LibraryManagementSystem Class
 * This class serves as the main method
 * Also serves as the entry point for the Library Management System.
 * It provides the console interface for users to interact with the library's collection of books.
 */
public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryManager manager = new LibraryManager();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            // Display the menu options
            System.out.println("Please choose an option:");
            System.out.println("1. Add new books from a text file");
            System.out.println("2. Remove a book by ID");
            System.out.println("3. List all books");
            System.out.println("4. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    // Ask the user to supply a text file - Example: Books.txt
                    System.out.println("Enter the filename to add books:");
                    String fileName = scanner.nextLine();
                    // Open the file and add books to the LMS
                    manager.readFromFile(fileName);
                    // Print the updated contents of the LMS
                    manager.listAllBooks();
                    break;
                case 2:
                    // Remove a book by ID
                    System.out.println("Enter the book ID to remove:");
                    int idToRemove = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    // Remove the book and print the updated contents of the LMS
                    manager.removeBook(idToRemove);
                    manager.listAllBooks();
                    break;
                case 3:
                    // List all books in the collection
                    manager.listAllBooks();
                    break;
                case 4:
                    // Exit the program
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
