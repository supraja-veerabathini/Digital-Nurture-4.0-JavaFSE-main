import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library(100);
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Library Management Menu ---");
            System.out.println("1. Add Book");
            System.out.println("2. Search by Title (Linear Search)");
            System.out.println("3. Search by Title (Binary Search)");
            System.out.println("4. Display All Books");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Author: ");
                    String author = scanner.nextLine();
                    library.addBook(new Book(id, title, author));
                    break;

                case 2:
                    System.out.print("Enter Title to search (Linear): ");
                    String searchLinear = scanner.nextLine();
                    Book foundLinear = library.linearSearchByTitle(searchLinear);
                    System.out.println(foundLinear != null ? foundLinear : "Book not found.");
                    break;

                case 3:
                    System.out.print("Enter Title to search (Binary): ");
                    String searchBinary = scanner.nextLine();
                    Book foundBinary = library.binarySearchByTitle(searchBinary);
                    System.out.println(foundBinary != null ? foundBinary : "Book not found.");
                    break;

                case 4:
                    library.displayAllBooks();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid option.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
