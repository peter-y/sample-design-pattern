package com.ycz.designpattern.structural.bridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LinuxImageImpl implements ImageImp {

    private static final Logger logger = LoggerFactory.getLogger(LinuxImageImpl.class);

    public void printImage(Matrix matrix) {
        logger.debug("linux show image");
    }
}
