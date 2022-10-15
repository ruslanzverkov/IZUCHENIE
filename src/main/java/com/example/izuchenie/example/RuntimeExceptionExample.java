package com.example.izuchenie.example;

public class RuntimeExceptionExample {

    public static void main(String[] args) {
        int number=2;
        if (number != 2) {
            throw new RuntimeException("Number is not 2");
        }
    }
}
