package org.MiracleStores.services;

import org.MiracleStores.entities.Cashier;
import org.MiracleStores.entities.Customer;
import org.MiracleStores.entities.Product;
import org.MiracleStores.enums.Gender;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CashierServiceImpTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testIssueReceipt() {
        Cashier cashier = new Cashier(33,"Oyo",
                "08054635622",Gender.FEMALE,"Cashier");
        Product product = new Product("Biscuit","00012",1500d,100);
        Customer customer = new Customer("Juliet","28888","0816675674",5000.00);
        CashierServiceImp cashierServTest= new CashierServiceImp();

        String expected = "payment status: " + "Successful" + "\n" +
                "Customer name: " + customer.getName() + "\n" +
                "customer phone number: " + customer.getMobileNumber() + "\n" +
                "customer id: " + customer.getId() + "\n" +
                "The customer can have " +product.getQuantity()+ " " + product.getName() + " at the rate of "+ "\n" +
                + product.getPrice() + " * " + product.getQuantity() + " = " + "\n" +
                + (product.getQuantity() * product.getPrice());
        String actual = cashierServTest.issueReceipt(cashier, product, customer) ;

        customer.setCustomerBalance(5000.00);

        assertEquals("payment status: " + "Failed"+ "\n" +
                "Customer name: " + customer.getName()+ "\n" +
                "customer phone number: " + customer.getMobileNumber()+ "\n" +
                "customer id: " + customer.getId() + "\n" +
                "The customer payment was failed",expected,actual);
    }
}