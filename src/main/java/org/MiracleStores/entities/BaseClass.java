package org.MiracleStores.entities;

import org.MiracleStores.enums.Gender;

public abstract class BaseClass {
    private String name;
    private int age;
    private String stateOfOrigin;
    private String mobileNumber;
    Gender gender;

    public BaseClass(int age, String stateOfOrigin, String mobileNumber, Gender gender) {
        this.age = age;
        this.stateOfOrigin = stateOfOrigin;
        this.mobileNumber = mobileNumber;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStateOfOrigin() {
        return stateOfOrigin;
    }

    public void setStateOfOrigin(String stateOfOrigin) {
        this.stateOfOrigin = stateOfOrigin;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "BaseClass{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", stateOfOrigin='" + getStateOfOrigin() + '\'' +
                ", mobileNumber='" + getMobileNumber() + '\'' +
                ", gender=" + getGender() +
                '}';
    }
}


