
package com.mycompany.minigarmentsjavaproject;
   import java.util.ArrayList;
   import java.util.List;

public class Supplier {
   


    private String supplierId;
    private String nameOfSupplier;
    private String contactInfo;
    private List<Fabric> suppliedFabrics;

   
    public Supplier(String supplierId, String nameOfSupplier, String contactInfo) {
        this.supplierId = supplierId;
        this.nameOfSupplier = nameOfSupplier;
        this.contactInfo = contactInfo;
        this.suppliedFabrics = new ArrayList<>();
    }

   
    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    
    public String getNameOfSupplier() {
        return nameOfSupplier;
    }

    public void setNameOfSupplier(String nameOfSupplier) {
        this.nameOfSupplier = nameOfSupplier;
    }

  
    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

  
    public void addFabric(Fabric fabric) {
        suppliedFabrics.add(fabric);
    }

  
    public List<Fabric> getSuppliedFabrics() {
        return suppliedFabrics;
    }
}