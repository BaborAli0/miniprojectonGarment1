
package miniproject_garment1;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
       
        Customer customer = new Customer("C001", "Alice Johnson", "alice@example.com", "123-456-7890");

       
        Fabric fabric1 = new Fabric("F001", "Cotton", "Blue", 10.5);
        Fabric fabric2 = new Fabric("F002", "Silk", "Red", 20.0);

      
        Garment garment1 = new Garment(1, "T-Shirt", "Comfortable cotton T-Shirt", "M", "Blue", 15.0, 50);
        Garment garment2 = new Garment(2, "Silk Scarf", "Elegant silk scarf", "One Size", "Red", 30.0, 20);

      
        Inventory inventory = new Inventory();
        inventory.addGarment(garment1);
        inventory.addGarment(garment2);
        inventory.displayGarments();

       
        Supplier supplier = new Supplier("S001", "John Supplies", "contact@johnsupplies.com");
        supplier.addFabric(fabric1);
        supplier.addFabric(fabric2);

    
        System.out.println("\nFabrics supplied by " + supplier.getNameOfSupplier() + ":");
        for (Fabric fabric : supplier.getSuppliedFabrics()) {
            System.out.println("  - " + fabric.getTypeOfFabric() + " (" + fabric.getColorOfFabric() + "), Price: $" + fabric.getPricePerMeter());
        }

        Order order = new Order("O001", new Date());
        order.addGarment(garment1);
        order.addGarment(garment2);
        order.calculateTotalAmount();
        order.printOrderDetails();

    
        customer.placeOrder(order);

        garment1.updateStock(-10); // in this here  Sold 10 units
        garment2.updateStock(-5);  //  '' ''    ''Sold 5 units
        System.out.println("\nUpdated Inventory:");
        inventory.displayGarments();

        
        double discountPrice = garment2.calculateDiscountPrice(10.0);
        System.out.println("\nDiscounted price of " + garment2.getName() + ": $" + discountPrice);
    }
}
 

