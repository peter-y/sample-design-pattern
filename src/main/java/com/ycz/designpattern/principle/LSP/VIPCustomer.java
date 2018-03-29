package com.ycz.designpattern.principle.LSP;

public class VIPCustomer extends Customer {

    public VIPCustomer(String name, String email) {
        super(name, email);
    }

    @Override
    public String getName() {
        return "[VIP Customer]" + super.getName();
    }
}
