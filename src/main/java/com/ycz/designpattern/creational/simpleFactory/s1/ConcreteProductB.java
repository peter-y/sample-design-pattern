package com.ycz.designpattern.creational.simpleFactory.s1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConcreteProductB extends Product {

    private static final Logger logger = LoggerFactory.getLogger(ConcreteProductB.class);

    public void doInput() {
        logger.debug("product b reday input");
    }
}
