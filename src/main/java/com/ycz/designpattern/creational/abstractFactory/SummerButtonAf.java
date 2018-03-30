package com.ycz.designpattern.creational.abstractFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SummerButtonAf implements ButtonAf {

    private static final Logger logger = LoggerFactory.getLogger(SummerButtonAf.class);

    public void display() {
        logger.debug("SummerButtonAf display");
    }
}
