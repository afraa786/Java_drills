import java.util.Scanner;
class Library {
    private int booknumber;
    private String[] no_ofbooks;
    Library() {
        this.booknumber = 0;
        this.no_ofbooks = new String[100];
    }
    void addbook(String book) {
        this.no_ofbooks[booknumber] = book;
        booknumber++;
        System.out.println(book + " book has been added");
    }
    void availablebooks() {
        if (booknumber == 0) {
            System.out.println("No books available in the library.");
            return;
        }
        System.out.println("Available books are:");
        for (int i = 0; i < booknumber; i++) {
            System.out.println(this.no_ofbooks[i]);
        }
    }
    void issuedbook(String issue) {
        boolean found = false;
        for (int i = 0; i < booknumber; i++) {
            if (this.no_ofbooks[i] != null && this.no_ofbooks[i].equalsIgnoreCase(issue)) {
                System.out.println(issue + " book has been issued");
                this.no_ofbooks[i] = null; // Mark the book as issued
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("This book does not exist or has already been issued");
        }
    }
}
public class OnlineLibrary {
    public static void main(String[] args) {
        Library lib = new Library();
        Scanner scanner = new Scanner(System.in);
        lib.addbook("The Alchemist");
        lib.addbook("Let Us C");
        lib.addbook("Data Structures and Algorithm in Java");
        lib.addbook("Let Us Java");
        lib.addbook("To Kill a Mockingbird");
        lib.addbook("Introduction to Algorithms");
        lib.addbook("Pride and Prejudice");
        lib.addbook("Structure and Interpretation of Computer Programs");
        // Menu loop
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Issue a book");
            System.out.println("2. View available books");
            System.out.println("3. Add a book");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            switch (choice) {
                case 1:
                    System.out.print("Enter the book name to issue: ");
                    String issueBook = scanner.nextLine();
                    lib.issuedbook(issueBook);
                    break;
                case 2:
                    lib.availablebooks();
                    break;
                case 3:
                    System.out.print("Enter the book name to add: ");
                    String newBook = scanner.nextLine();
                    lib.addbook(newBook);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}