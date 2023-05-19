package org.MiracleStores.entities;

public class Product {
    private String name;
    private String id;
    private double price;
    private int Quantity;

    public Product(String name, String id, double price, int quantity) {
        this.name = name;
        this.id = id;
        this.price = price;
        Quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }
}
