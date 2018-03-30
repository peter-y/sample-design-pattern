package com.ycz.designpattern.creational.factoryMethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FileLoggerFm implements LoggerFm {

    private static final Logger logger = LoggerFactory.getLogger(FileLoggerFm.class);

    public void writeLog(String writeContent) {
        logger.debug(writeContent);
    }
}
