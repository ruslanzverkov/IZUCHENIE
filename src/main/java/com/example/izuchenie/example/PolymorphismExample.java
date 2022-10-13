package com.example.izuchenie.example;

import com.example.izuchenie.domain.Driver;
import com.example.izuchenie.domain.TruckDriver;

public class PolymorphismExample {
    public static void main(String[] args) {
        Driver driver = new TruckDriver(
                "Макс",
                "Крючков",
                "123",
                "2456"
        );
        driver.setDriverLicenseNumber("1234");
        System.out.println("driver.getDriverLicenseNumber=" +driver.getDriverLicenseNumber());

    }
}
