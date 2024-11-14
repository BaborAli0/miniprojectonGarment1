import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Garment> garments;

    public Inventory() {
        garments = new ArrayList<>();
    }


    public void addGarment(Garment garment) {
        garments.add(garment);
        System.out.println("Garment added to inventory: " + garment);
    }

   
    public void removeGarment(int id) {
        garments.removeIf(garment -> garment.getId() == id);
        System.out.println("Garment with ID " + id + " removed from inventory.");
    }

  
    public void displayGarments() {
        if (garments.isEmpty()) {
            System.out.println("No garments in inventory.");
        } else {
            for (Garment garment : garments) {
                System.out.println(garment);
            }
        }
    }
}
