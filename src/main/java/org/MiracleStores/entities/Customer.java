package org.MiracleStores.entities;

public class Customer {
    private String name;
    private String id;
    private String mobileNumber;

    private double customerBalance;

    public Customer() {
    }

    public Customer(String name, String id, String mobileNumber, double customerBalance) {
        this.name = name;
        this.id = id;
        this.mobileNumber = mobileNumber;
        this.customerBalance = customerBalance;


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

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public double getCustomerBalance() {
        return customerBalance;
    }

    public void setCustomerBalance(double customerBalance) {
        this.customerBalance = customerBalance;
    }
}


