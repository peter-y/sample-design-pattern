package com.ycz.designpattern.creational.abstractFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 具体产品
 */
public class SpringButtonAf implements ButtonAf {

    private static final Logger logger = LoggerFactory.getLogger(SpringButtonAf.class);

    public void display() {
        logger.debug("SpringButtonAf display");
    }
}
