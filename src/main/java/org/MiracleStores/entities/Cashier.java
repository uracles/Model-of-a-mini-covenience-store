package org.MiracleStores.entities;

import org.MiracleStores.enums.Gender;

public class Cashier extends BaseClass {
    private String cashierRole;




    public Cashier(int age, String stateOfOrigin, String mobileNumber, Gender gender, String cashierRole) {
        super(age, stateOfOrigin, mobileNumber, gender);
        this.cashierRole = cashierRole;
    }

    public String getCashierRole() {
        return cashierRole;
    }

    public void setCashierRole(String cashierRole) {
        this.cashierRole = cashierRole;
    }

}



