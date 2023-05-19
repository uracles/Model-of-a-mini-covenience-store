package org.MiracleStores.services;

import org.MiracleStores.entities.Manager;
import org.MiracleStores.enums.Gender;
import org.junit.Test;

import static org.junit.Assert.*;

public class ManagerServiceImpTest {

    @Test
    public void hireStaff() {
        Manager manager = new Manager(35,"Kogi","08034536728",
                Gender.MALE,"Manager");
        ManagerServiceImp managerServTest = new ManagerServiceImp();

        String expected = "The store cashier is available" ;
        String actual = managerServTest.hireStaff(manager);
        manager.getManagerRole();


        assertEquals("The cashier is not available, the store needs a cashier",expected,actual);
    }
}