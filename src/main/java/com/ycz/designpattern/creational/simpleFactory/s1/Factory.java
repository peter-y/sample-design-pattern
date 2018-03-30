package com.ycz.designpattern.creational.simpleFactory.s1;

public class Factory {

    public static Product getProduct(String arg) {
        if (!(arg != null && arg.length() > 0)) {
            return null;
        }
        if (arg.equalsIgnoreCase("a")) {
            return new ConcreteProductA();
        }
        if (arg.equalsIgnoreCase("b")) {
            return new ConcreteProductB();
        }
        return null;
    }
}
