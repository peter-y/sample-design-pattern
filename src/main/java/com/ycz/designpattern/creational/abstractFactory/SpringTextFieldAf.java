package com.ycz.designpattern.creational.abstractFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SpringTextFieldAf implements TextFieldAf {

    private static final Logger logger = LoggerFactory.getLogger(SpringTextFieldAf.class);

    public void display() {
        logger.debug("SpringTextFieldAf display");
    }
}
