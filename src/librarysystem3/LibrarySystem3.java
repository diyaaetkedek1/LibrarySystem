/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package librarysystem3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Diyaa Etkedek
 */
public class LibrarySystem3 {

    /**
     * @param args the command line arguments
     */
    private static ArrayList<Book> books = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        // Sample data
        initializeBooks();

        do {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Search by Book Name");
            System.out.println("2. Search by Book Number");
            System.out.println("3. Search by Author Name");
            System.out.println("4. Check Book Loans");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    searchByBookName(scanner);
                    break;
                case 2:
                    searchByBookNumber(scanner);
                    break;
                case 3:
                    searchByAuthorName(scanner);
                    break;
                case 4:
                    checkBookLoans();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
    }

    private static void initializeBooks() {
        // Add sample books to the list
        // Example: books.add(new Book("Book Title", new BookAuthor(...), "123", "Genre", "Version", new Date(1, 1, 2020), false));
    }

    private static void searchByBookName(Scanner scanner) {
        System.out.print("Enter Book Name: ");
        String name = scanner.nextLine();
        // Implement search logic
    }

    private static void searchByBookNumber(Scanner scanner) {
        System.out.print("Enter Book Number: ");
        String number = scanner.nextLine();
        // Implement search logic
    }

    private static void searchByAuthorName(Scanner scanner) {
        System.out.print("Enter Author Name: ");
        String authorName = scanner.nextLine();
        // Implement search logic
    }

    private static void checkBookLoans() {
        // Implement logic to display loaned books
    }

}