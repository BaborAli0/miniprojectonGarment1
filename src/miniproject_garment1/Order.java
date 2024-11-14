import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private String orderId;
    private Date orderDate;
    private List<Garment> garmentList;
    private double totalAmount;

    public Order(String orderId, Date orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.garmentList = new ArrayList<>();
        this.totalAmount = 0.0;
    }

    public void addGarment(Garment garment) {
        garmentList.add(garment);
    }

    public void calculateTotalAmount() {
        totalAmount = garmentList.stream()
                .mapToDouble(garment -> garment.getQuantity() * garment.getPrice())
                .sum();
    }

    public void printOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
        System.out.println("Garments:");
        for (Garment garment : garmentList) {
            System.out.println("  - " + garment.getName() + " (Qty: " + garment.getQuantity() + ", Price: " + garment.getPrice() + ")");
        }
        System.out.println("Total Amount: " + totalAmount);
    }

  
    public double getTotalAmount() {
        return totalAmount;
    }
}