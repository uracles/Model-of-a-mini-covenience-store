package org.MiracleStores.services;

import org.MiracleStores.entities.Manager;

public class ManagerServiceImp implements ManagerService {



    public String hireStaff(Manager manager) {
        if(manager.getManagerRole() == "Manager"){
            return "The store cashier is available";
        }else
            return "The cashier is not available, the store needs a cashier";
}
}
