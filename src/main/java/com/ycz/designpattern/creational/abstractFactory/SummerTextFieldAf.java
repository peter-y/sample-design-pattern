package com.ycz.designpattern.creational.abstractFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SummerTextFieldAf implements TextFieldAf {

    private static final Logger logger = LoggerFactory.getLogger(SummerTextFieldAf.class);

    public void display() {
        logger.debug("SummerTextFieldAf display");
    }
}
