package com.ycz.designpattern.structural.composite;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TextFile extends AbstractCommonFile {

    private static final Logger logger = LoggerFactory.getLogger(TextFile.class);

    public TextFile(String name) {
        super(name);
        setLogger(logger);
    }

    public void killVirus() {
        logger.debug("对text文件 {} 进行杀毒", getName());
    }
}
