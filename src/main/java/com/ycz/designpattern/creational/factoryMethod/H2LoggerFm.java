package com.ycz.designpattern.creational.factoryMethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class H2LoggerFm implements LoggerFm {

    private static final Logger logger = LoggerFactory.getLogger(H2LoggerFm.class);

    public void writeLog(String writeContent) {
        logger.debug(writeContent);
    }
}
