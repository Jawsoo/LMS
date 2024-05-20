 Library Management System (LMS)

- Name: Josue Suazo
- Course: Software Development 1
- CRN: CEN-3024C

 Project Description
This project is a simple Library Management System (LMS) developed as part of the SDLC Assignment. The LMS allows users to manage a collection of books, including adding, removing, and listing books. Books can be added by supplying a text file with book details.

 Features
- Add new books from a text file containing book details.
- Remove a book by its unique ID.
- List all books currently in the library collection.


 Classes and Their Functions

Book
Represents a book with a unique ID, title, and author. It provides methods to retrieve book details and convert them to a string format.

LibraryManager
Manages the collection of books in the library. Provides functionalities to add, remove, and list books, as well as read book details from a text file.

LibraryManagementSystem
Contains the `main` method and serves as the entry point for the Library Management System. It provides a console-based interface for users to interact with the library's collection of books.

How to Run the Program
1. Compile the Classes: Ensure all classes (`Book`, `LibraryManager`, and `LibraryManagementSystem`) are compiled.
2. Run the Main Class: Execute the `LibraryManagementSystem` class. This will start the console-based interface for the LMS.


To add books from a text file, the file should contain book details in the following format:

1, The Legend of Josue Suazo, Josue Suazo
