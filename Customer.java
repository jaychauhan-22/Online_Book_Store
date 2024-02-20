import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Customer {
    private String customername;
    private int customerage;
    protected Set<String> booksbought;
    protected Map<String,Integer> booktoquantity;
    protected int billoverdue;
    Customer(String customername,int customerage){
        this.customername = customername;
        this.customerage = customerage;
        this.booksbought = new HashSet<>();
        this.billoverdue = 0;
        this.booktoquantity = new HashMap<>();
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
