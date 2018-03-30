package com.ycz.designpattern.creational.factoryMethod.exercise;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GifReader implements ImageReader {

    private static final Logger logger = LoggerFactory.getLogger(GifReader.class);

    public void read() {
        logger.debug("to git read");
    }
}
