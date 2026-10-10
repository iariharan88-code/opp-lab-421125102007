import java.util.Scanner;

class Library {
    String bookName;
    String author;
    boolean available;

    Library(String bookName, String author) {
        this.bookName = bookName;
        this.author = author;
        this.available = true;
    }

    void displayBook() {
        System.out.println("Book: " + bookName);
        System.out.println("Author: " + author);
        System.out.println("Status: " + (available ? "Available" : "Issued"));
    }

    void issueBook() {
        if (available) {
            available = false;
            System.out.println("Book issued successfully.");
        } else {
            System.out.println("Book is already issued.");
        }
    }

    void returnBook() {
        if (!available) {
            available = true;
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("Book was not issued.");
        }
    }
}

public class LibraryManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Library book = new Library("Java Programming", "James Gosling");

        int choice;

        do {
            System.out.println("\n--- Library Management System ---");
            System.out.println("1. Display Book");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    book.displayBook();
                    break;

                case 2:
                    book.issueBook();
                    break;

                case 3:
                    book.returnBook();
                    break;

                case 4:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        sc.close();
    }
}
