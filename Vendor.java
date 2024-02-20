import java.util.Scanner;
import java.util.Set;

public class Vendor  {

    public Customer doCustomerAuthentication(){
        System.out.print("\n\nCustomer Login <new/old>: ");
        Scanner s = new Scanner(System.in);
        String customer_type = s.nextLine().toLowerCase();
        // For new Customer
        if (customer_type.equals("new")) {
            Customer newcustomer = this.createNewCustomer();
            return newcustomer;
        }
        else if(customer_type.equals("old")){
            Customer oldcustomer = this.loginExistingCustomer();
            return oldcustomer;
        }
        return null;
    }


    public Customer createNewCustomer(){
        String customername;
        int customerage;
        Scanner s = new Scanner(System.in);
        System.out.print("Customer Name: ");
        customername = s.nextLine().toUpperCase();
        System.out.print("Customer Age: ");
        customerage = s.nextInt();
        Customer newcustomer = new Customer(customername,customerage);
        return newcustomer;
    }
    public Customer loginExistingCustomer(){
        
        return null;
    }
    public Set<Book> getAllAvailableBooks(){
        Book books = new Book();
        Set<Book> setofbooks= Book.getAllAvailableBooks();
        return setofbooks;
    }
    public Book searchBookByName(String searchbook){
        Book b= Book.searchBookInRepo(searchbook);
        return b;
    }
}
