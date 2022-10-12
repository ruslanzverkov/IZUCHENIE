package com.example.izuchenie.domain;

public class Driver extends Person{
    private  String driverLicenseNumber;

    public Driver(String name, String surName, String passport, String driverLicenseNumber) {
        super(name, surName, passport);
        this.driverLicenseNumber = driverLicenseNumber;

    }

    public String getDriverLicenseNumber() {
        return driverLicenseNumber;
    }

    public void setDriverLicenseNumber(String driverLicenseNumber) {
        this.driverLicenseNumber = driverLicenseNumber;
    }
}
