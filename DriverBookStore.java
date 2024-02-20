import java.util.Scanner;
import java.util.Set;

public class DriverBookStore {

    public static void main(String[] args) {
        Vendor vendor = new Vendor();

        // Welcome Message
        System.out.println("Hello and Welcome to Online Book Store");
        

            // Check for Customer: New/Old and Authenticate it
        Customer customer = vendor.doCustomerAuthentication();
        // Print Customer Details 
        System.out.println(customer);
            System.out.println("Login Successful.");
            System.out.println("\n\nNavigation:");
            System.out.println("1: View Available Books.");
            System.out.println("2: Search Book.");
            System.out.println("5: Exit.");
            System.out.print("Choice: ");
            Scanner s = new Scanner(System.in);
            int navigationchoice = Integer.parseInt(s.nextLine());
            switch (navigationchoice) {
                case 1:
                    Set<Book> books = vendor.getAllAvailableBooks();
                    for(Book b : books){
                        System.out.println(b.getBookDetail());
                    }
                    break;
                case 2:
                    System.out.print("\nSearch Book:");
                    String booksearch = s.nextLine();
                    System.out.println(booksearch);
                    Book searchedresult = vendor.searchBookByName(booksearch);
                    System.out.println(searchedresult.getBookDetail());
                default:
                    System.exit(0);
                    break;
            }
            // System.out.println(navigationchoice);
            s.close();
        
        



    }
}