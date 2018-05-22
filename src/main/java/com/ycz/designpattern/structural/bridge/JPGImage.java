package com.ycz.designpattern.structural.bridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JPGImage extends Image {

    private static final Logger logger = LoggerFactory.getLogger(JPGImage.class);

    public void parseFile(String filename) {
        Matrix m = new Matrix();
        imageImp.printImage(m);
        logger.debug("print jpgimage info {}", filename);
    }
}
