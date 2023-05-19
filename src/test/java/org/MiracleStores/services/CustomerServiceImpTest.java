package org.MiracleStores.services;

import org.MiracleStores.entities.Customer;
import org.MiracleStores.entities.Product;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerServiceImpTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void buyProduct() {
        Customer customer = new Customer("Juliet","28888","0816675674",5000.00);
        Product product = new Product("Biscuit","00012",1500d,100);

        CustomerServiceImp customerServTest = new CustomerServiceImp();

        String expected ="Purchase status: Successful" + "\n" +
                "Customer name: " + customer.getName() + "\n" +
                "Product Qty: " + product.getQuantity() + "\n" +
                "Product Price: " + product.getPrice();;

        String actual = customerServTest.buyProduct();


        assertEquals("Customer cannot buy product here", expected, actual);
    }
}