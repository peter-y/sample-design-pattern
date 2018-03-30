package com.ycz.designpattern.creational.factoryMethod.exercise;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JpegReader implements ImageReader {

    private static final Logger logger = LoggerFactory.getLogger(JpegReader.class);

    public void read() {
        logger.debug("to jpeg read");
    }
}
