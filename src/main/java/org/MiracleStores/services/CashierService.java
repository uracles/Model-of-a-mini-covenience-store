package org.MiracleStores.services;
import org.MiracleStores.entities.Cashier;
import org.MiracleStores.entities.Customer;
import org.MiracleStores.entities.Product;


interface CashierService {
         String issueReceipt(Cashier cashier, Product product, Customer customer);



}
