package com.ycz.designpattern.structural.bridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PNGImage extends Image {

    private static final Logger logger = LoggerFactory.getLogger(PNGImage.class);

    public void parseFile(String filename) {
        Matrix m = new Matrix();
        imageImp.printImage(m);
        logger.debug("print pngimage info {}", filename);
    }
}
