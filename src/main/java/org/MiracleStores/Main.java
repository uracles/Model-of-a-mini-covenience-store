package org.MiracleStores;

import org.MiracleStores.entities.Cashier;
import org.MiracleStores.entities.Customer;
import org.MiracleStores.entities.Manager;
import org.MiracleStores.entities.Product;
import org.MiracleStores.enums.Gender;
import org.MiracleStores.services.CashierServiceImp;
import org.MiracleStores.services.CustomerServiceImp;
import org.MiracleStores.services.ManagerServiceImp;

public class Main {
    public static void main(String[] args) {


        Product product = new Product("Biscuit","00012",1500d,100);



        Customer customer = new Customer("Juliet","28888","0816675674",5000.00);
        CustomerServiceImp customerServiceImp = new CustomerServiceImp();
        System.out.println(customerServiceImp.buyProduct());
        System.out.println("........................");



        Manager manager = new Manager(35,"Kogi","08034536728",
                Gender.MALE,"Manager");
        ManagerServiceImp managerServiceImp = new ManagerServiceImp();
        System.out.println(managerServiceImp.hireStaff(manager));
        System.out.println("........................");



        Cashier cashier = new Cashier(33,"Oyo",
                "08054635622",Gender.FEMALE,"Cashier");
        CashierServiceImp cashierServiceImp = new CashierServiceImp();
        System.out.println(cashierServiceImp.issueReceipt(cashier,product,customer));
        System.out.println("........................");




    }


    
}