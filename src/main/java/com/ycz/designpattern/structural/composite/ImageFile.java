package com.ycz.designpattern.structural.composite;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ImageFile extends AbstractCommonFile {

    private static final Logger logger = LoggerFactory.getLogger(ImageFile.class);

    public ImageFile(String name) {
        super(name);
        setLogger(logger);
    }

    public void killVirus() {
        logger.debug("对image文件 {} 进行杀毒", getName());
    }
}
