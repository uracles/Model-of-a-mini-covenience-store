package org.MiracleStores.services;

import org.MiracleStores.entities.Cashier;
import org.MiracleStores.entities.Customer;
import org.MiracleStores.entities.Product;
import org.MiracleStores.enums.Gender;

public class CashierServiceImp implements CashierService {
    Cashier cashier = new Cashier(0,"","",Gender.MALE,"Cashier");
    Customer customer = new Customer("Juliet","28888","0816675674",5000.00);
    @Override
    public String issueReceipt(Cashier cashier, Product product, Customer customer) {
        if(customer.getCustomerBalance() >= product.getPrice()){

            return
                    "payment status: " + "Successful" + "\n" +
            "Customer name: " + customer.getName() + "\n" +
            "customer phone number: " + customer.getMobileNumber() + "\n" +
            "customer id: " + customer.getId() + "\n" +
            "The customer can have " +product.getQuantity()+ " " + product.getName() + " at the rate of "+ "\n" +
                    + product.getPrice() + " * " + product.getQuantity() + " = " + "\n" +
                            + (product.getQuantity() * product.getPrice());
        }else {
            return
                    "payment status: " + "Failed"+ "\n" +
            "Customer name: " + customer.getName()+ "\n" +
            "customer phone number: " + customer.getMobileNumber()+ "\n" +
            "customer id: " + customer.getId() + "\n" +
            "The customer payment was failed";

        }

    }


    }


