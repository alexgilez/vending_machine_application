package com.techelevator;

import java.math.BigDecimal;

public class Beverage extends VendingMachineItem{
    public static final String BEVERAGE_MESSAGE = "Cheers Glug, Glug!";
    public Beverage(String name, BigDecimal price, String code, String message, int quantity){
        super(name, price, code);
        this.message = BEVERAGE_MESSAGE;
    }

    @Override
    public String getMessage() {
        return BEVERAGE_MESSAGE;
    }
}