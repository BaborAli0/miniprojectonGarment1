
package com.mycompany.minigarmentsjavaproject;

public class Fabric {
  
    private String idOfFabric;
    private String typeOfFabric;
    private String colorOfFabric;
    private double pricePerMeter;

 
    public Fabric(String idOfFabric, String typeOfFabric, String colorOfFabric, double pricePerMeter) {
        this.idOfFabric = idOfFabric;
        this.typeOfFabric = typeOfFabric;
        this.colorOfFabric = colorOfFabric;
        this.pricePerMeter = pricePerMeter;
    }

  
    public String getIdOfFabric() {
        return idOfFabric;
    }

    public void setIdOfFabric(String idOfFabric) {
        this.idOfFabric = idOfFabric;
    }

    public String getTypeOfFabric() {
        return typeOfFabric;
    }

    public void setTypeOfFabric(String typeOfFabric) {
        this.typeOfFabric = typeOfFabric;
    }

    public String getColorOfFabric() {
        return colorOfFabric;
    }

    public void setColorOfFabric(String colorOfFabric) {
        this.colorOfFabric = colorOfFabric;
    }

    public double getPricePerMeter() {
        return pricePerMeter;
    }

    public void setPricePerMeter(double pricePerMeter) {
        this.pricePerMeter = pricePerMeter;
    }

   
    public double calculateCost(double meter) {
        return pricePerMeter * meter;
    }
}