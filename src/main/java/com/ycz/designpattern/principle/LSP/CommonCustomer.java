package com.ycz.designpattern.principle.LSP;

public class CommonCustomer extends Customer {

    public CommonCustomer(String name, String email) {
        super(name, email);
    }

    @Override
    public String getName() {
        return "[Common Customer]" + super.getName();
    }
}
