package org.MiracleStores.services;

import org.MiracleStores.entities.Product;
import org.MiracleStores.entities.Customer;

public class CustomerServiceImp implements CustomerService {

    Customer customer = new Customer("Juliet","28888","0816675674",5000.00);
    Product product = new Product("Biscuit","00012",1500d,100);
    @Override
    public String buyProduct() {
return
        "Purchase status: Successful" + "\n" +
                "Customer name: " + customer.getName() + "\n" +
                "Product Qty: " + product.getQuantity() + "\n" +
                "Product Price: " + product.getPrice();

    }
}


