package com.ycz.designpattern.creational.simpleFactory.s1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConcreteProductA extends Product {

    private static final Logger logger = LoggerFactory.getLogger(ConcreteProductA.class);

    public void doInput() {
        logger.debug("product a reday input");
    }
}
