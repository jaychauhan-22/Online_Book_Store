import java.util.Set;

public class Customer {
    private String customername;
    private int customerage;
    Customer(String customername,int customerage){
        this.customername = customername;
        this.customerage = customerage;
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
