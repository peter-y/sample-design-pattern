package com.ycz.designpattern.structural.bridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WindowsImageImpl implements ImageImp {

    private static final Logger logger = LoggerFactory.getLogger(WindowsImageImpl.class);

    public void printImage(Matrix matrix) {
        logger.debug("windows show image");
    }
}
