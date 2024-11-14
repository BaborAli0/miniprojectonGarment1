package com.mycompany.minigarmentsjavaproject;

public class Garment {
  
    private int uniqueIdOfGarments; 
    private String nameOfGarment; 
    private String descriptionOfGarment; 
    private String sizeOfGarment; 
    private String colorOfGarment; 
    private double priceOfGarment; 
    private int itemStock; 

    public Garment(int uniqueIdOfGarments, String nameOfGarment, String description, String size, String color, double price, int stock) {
        this.uniqueIdOfGarments = uniqueIdOfGarments;
        this.nameOfGarment = nameOfGarment;
        this.descriptionOfGarment = description;
        this.sizeOfGarment = size;
        this.colorOfGarment = color;
        this.priceOfGarment = price;
        this.itemStock = stock;
    }

    public int getId() {
        return uniqueIdOfGarments;
    }

    public void setId(int id) {
        this.uniqueIdOfGarments = id;
    }

    public String getName() {
        return nameOfGarment;
    }

    public void setName(String name) {
        this.nameOfGarment = name;
    }

    public String getDescription() {
        return descriptionOfGarment;
    }

    public void setDescription(String description) {
        this.descriptionOfGarment = description;
    }

    public String getSize() {
        return sizeOfGarment;
    }

    public void setSize(String size) {
        this.sizeOfGarment = size;
    }

    public String getColor() {
        return colorOfGarment;
    }

    public void setColor(String color) {
        this.colorOfGarment = color;
    }

    public double getPrice() {
        return priceOfGarment;
    }

    public void setPrice(double price) {
        this.priceOfGarment = price;
    }

    public int getStock() {
        return itemStock;
    }

    public void setStock(int stock) {
        this.itemStock = stock;
    }

    public void updateStock(int quantity) {
        this.itemStock += quantity;
    }

    public double calculateDiscountPrice(double discountPercentage) {
        return priceOfGarment - (priceOfGarment * (discountPercentage / 100));
    }

    @Override
    public String toString() {
        return "Garment{" +
                "id=" + uniqueIdOfGarments +
                ", name='" + nameOfGarment + '\'' +
                ", description='" + descriptionOfGarment + '\'' +
                ", size='" + sizeOfGarment + '\'' +
                ", color='" + colorOfGarment + '\'' +
                ", price=" + priceOfGarment +
                ", stock=" + itemStock +
                '}';
    }
}
