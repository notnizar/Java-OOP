import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library myLibrary = new Library(10);
        System.out.println("Total Books Created: " + Book.getCount());

        while (true) {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Add Book");
            System.out.println("2. Search Book");
            System.out.println("3. Remove Book");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 ->
                    AddBook_menu(scanner, myLibrary);

                case 2 ->
                    SearchBook_menu(scanner, myLibrary);

                case 3 -> {
                    System.out.print("Enter Title to Remove: ");
                    String removeTitle = scanner.nextLine();

                    myLibrary.removeBook(removeTitle);
                }

                case 4 -> {
                    System.out.println("Goodbye!");
                    return;
                }

                default ->
                    System.out.println("Invalid option! Try again.");
            }
            System.out.println("Total Books Created: " + Book.getCount());
        }

    }

    private static void SearchBook_menu(Scanner scanner, Library myLibrary) {
        System.out.print("Enter Title to Search: ");
        String searchTitle = scanner.nextLine();

        Book found = myLibrary.searchByTitle(searchTitle);
        if (found != null) {
            System.out.println("The Book Founded: " + found);
            if (found instanceof EBook) {
                EBook ebook = (EBook) found;
                System.out.println(ebook.getFileSizeMB());
            } else {
                System.out.println("Its a pysical book");
            }
        } else {
            System.out.println("Book Not Founded");
        }
    }

    private static void AddBook_menu(Scanner scanner, Library myLibrary) {
        System.out.print("Enter Title: ");
        String title = scanner.nextLine();
        System.out.print("Enter Author: ");
        String autherName = scanner.nextLine();
        System.out.println("Enter Auther Natiolatly");
        String authNatiolaty = scanner.nextLine();
        System.out.println("Enter Auther Email");
        String authEmail = scanner.nextLine();
        Author author = new Author(autherName, authNatiolaty, authEmail);
        System.out.print("Enter Price: ");
        double price = scanner.nextDouble();

        System.out.println("1-EBook");
        System.out.println("2-Paper Book");
        int e_p = scanner.nextInt();

        if (e_p == 1) {
            System.out.println("Enter File Size: ");
            double fileSizeMB = scanner.nextDouble();
            EBook e1 = new EBook(title, author, price, fileSizeMB);
            myLibrary.addBook(e1);
        } else if (e_p == 2) {
            Book b1 = new PaperBook(title, author, price, price);
            myLibrary.addBook(b1);
        }
    }
}
