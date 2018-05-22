package com.ycz.designpattern.structural.composite;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VideoFile extends AbstractCommonFile {

    private static final Logger logger = LoggerFactory.getLogger(VideoFile.class);

    public VideoFile(String name) {
        super(name);
        setLogger(logger);
    }

    public void killVirus() {
        logger.debug("对video文件 {} 进行杀毒", getName());
    }
}
