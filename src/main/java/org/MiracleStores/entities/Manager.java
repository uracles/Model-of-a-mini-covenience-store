package org.MiracleStores.entities;

import org.MiracleStores.enums.Gender;


public class Manager extends BaseClass {

    private String managerRole;

    public Manager(int age, String stateOfOrigin, String mobileNumber, Gender gender, String managerRole) {
        super(age, stateOfOrigin, mobileNumber, gender);
        this.managerRole = managerRole;
    }

    public String getManagerRole() {
        return managerRole;
    }

    public void setManagerRole(String managerRole) {
        this.managerRole = managerRole;
    }

    }




