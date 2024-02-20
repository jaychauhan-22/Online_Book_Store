import java.util.HashSet;
import java.util.Set;

public class Customer {
    private String customername;
    private int customerage;
    protected Set<String> booksbought;
    protected int billoverdue;
    Customer(String customername,int customerage){
        this.customername = customername;
        this.customerage = customerage;
        this.booksbought = new HashSet<>();
        this.billoverdue = 0;
    }
    public  Set<Customer> getAllCustomersDetails(){return null;};
    public  Customer getCustomerDetails(){
        return this;
    };
    
    @Override
    public String toString() {
        return "\n\nCustomer Details: \nName: "+this.customername+"\nAge: "+this.customerage;
        
    }
}
