import java.util.Scanner;
import java.util.Set;

public class DriverBookStore {

    public static void handleCustomerOperation(Vendor vendor, Customer customer) {
        Scanner s = new Scanner(System.in);
        System.out.println("\n\nNavigation:");
        System.out.println("1: View Available Books.");
        System.out.println("2: Search Book.");
        System.out.println("4: Bill Info.");
        System.out.println("5: Back to Main Menu.");
        System.out.print("Choice: ");

        int navigationchoice = Integer.parseInt(s.nextLine());
        switch (navigationchoice) {
            case 1:
                Set<Book> books = vendor.getAllAvailableBooks();
                System.out.println("\nBook Details");
                for (Book b : books) {
                    System.out.println(b.getBookDetail());
                }
                break;
            case 2:
                System.out.print("\nSearch Book:");
                String booksearch = s.nextLine();
                Book searchedresult = vendor.searchBookByName(booksearch);
                if (searchedresult == null) {
                    System.out.println("Book Not Found.. Try Again");
                } else {
                    System.out.println(searchedresult.getBookDetail());
                    System.out.println("\nPress 1: To buy Book");
                    System.out.println("Press any other digit: To return to book menu");
                    int buychoice = Integer.parseInt(s.nextLine());
                    System.out.println(buychoice);
                    if(buychoice==1)
                        vendor.buyBook(customer,searchedresult);
                    
                }
                break;
            case 4:
                vendor.getBillInfo(customer);
                break;
            case 5:
                DriverBookStore.main(null);
                break;
            default:
                break;
        }
        DriverBookStore.handleCustomerOperation(vendor, customer);
        s.close();
    }

    public static void handleVendorOperation() {

    }

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("Hello and Welcome to Online Book Store");
        Scanner s = new Scanner(System.in);
        System.out.println("1: Customer Login");
        System.out.println("2: Vendor Login");
        System.out.println("3: Exit");
        System.out.print("Choice: ");
        int logintype = Integer.parseInt(s.nextLine());
        switch (logintype) {
            case 1:
                Vendor vendor = new Vendor();
                Customer customer = vendor.doCustomerAuthentication();
                System.out.println(customer);
                System.out.println("Login Successful.");
                DriverBookStore.handleCustomerOperation(vendor, customer);
                break;
            case 2:
                DriverBookStore.handleVendorOperation();
                break;
            default:
                System.exit(0);
                break;
        }
        DriverBookStore.main(null);
        s.close();

    }
}