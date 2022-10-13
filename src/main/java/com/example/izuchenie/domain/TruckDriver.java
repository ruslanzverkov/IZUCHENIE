package com.example.izuchenie.domain;

public class TruckDriver extends Driver {
    public TruckDriver(String name, String surName, String passport, String driverLicenseNumber) {
        super(name, surName, passport, driverLicenseNumber);
    }

    public void setDriverLicenseNumber(String driverLicenseNumber) {
        if (driverLicenseNumber!=null&&driverLicenseNumber.startsWith("2")) {
            super.setDriverLicenseNumber(driverLicenseNumber);
        }
    }
}
