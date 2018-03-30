package com.ycz.designpattern.creational.abstractFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SummerComboBoxAf implements ComboBoxAf {

    private static final Logger logger = LoggerFactory.getLogger(SummerComboBoxAf.class);

    public void display() {
        logger.debug("SummerComboBoxAf display");
    }
}
