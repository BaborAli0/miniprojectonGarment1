import java.util.List;
import java.util.ArrayList;
import java.util.Date;

// Your class definitions go here

public class Customer {
   // import java.util.List;
    private String customerID;
    private String customerName;
    private String emailAddress;
    private String phoneNumber;

    public Customer(String customerID, String customerName, String emailAddress, String phoneNumber) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public List<Order> viewOrders() {
      
        return null;
    }

    public void placeOrder(Order order) {
     
    }
}