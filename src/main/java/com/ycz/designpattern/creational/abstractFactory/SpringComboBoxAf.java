package com.ycz.designpattern.creational.abstractFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SpringComboBoxAf implements ComboBoxAf {

    private static final Logger logger = LoggerFactory.getLogger(SpringComboBoxAf.class);

    public void display() {
        logger.debug("SpringComboBoxAf display");
    }
}
