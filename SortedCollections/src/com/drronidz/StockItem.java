package com.drronidz;/*
    CREATED BY : ABD EL HALIM
    PROJECT NAME : {IntelliJ IDEA}
    CREATED ON : 4/30/2021 , 
    CREATED ON : 3:32 PM
*/

public class StockItem implements Comparable<StockItem> {

    private final String name;
    private double price;
    private int quantityStock = 0;  // can be initialized later
    private int reserved = 0;

    public StockItem(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantityStock = 0; // or here (but you wouldn't normally do both)
    }

    public StockItem(String name, double price, int quantityStock) {
        this.name = name;
        this.price = price;
        this.quantityStock = quantityStock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int availableQuantity() {
        return quantityStock - reserved;
    }

    public void setPrice(double price) {
        if(price > 0.0) {
            this.price = price;
        }
    }

    public void adjustStock(int quantity){
        int newQuantity = this.quantityStock + quantity;
        if(newQuantity >=0) {
            this.quantityStock = newQuantity;
        }
    }

    public int reserveStock(int quantity){
        if(quantity <= availableQuantity()) {
            // Use the method, not the field
            reserved += quantity;
            return quantity;
        }
        return 0;
    }

    public int unreserveStock(int quantity){
        if(quantity <= quantityStock) {
            reserved -= quantity;
            return quantity;
        }
        return 0;
    }

    public int finaliseStock(int quantity) {
        if(quantity <= reserved) {
            quantityStock -= quantity;
            reserved -= quantity;
            return quantity;
        }
        return 0;
    }

    @Override
    public int compareTo(StockItem stockItem) {
        //System.out.println("Entering StockItem.compareTo");
        if(this == stockItem){
            return 0;
        }
        if(stockItem != null) {
            return  this.name.compareTo(stockItem.getName());
        }
        throw new NullPointerException();
    }

    @Override
    public boolean equals(Object object) {
        System.out.println("Entering StockItem.equals");
        if(object == this){
            return true;
        }
        if((object == null) || (object.getClass() != this.getClass())) {
            return false;
        }

        String objectName = ((StockItem) object).getName();
        return this.name.equals(objectName);
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + 31 ;
    }

    @Override
    public String toString() {
        return this.getName() +" : price "+this.getPrice() + ". Reserved: " + this.reserved;
    }
}
