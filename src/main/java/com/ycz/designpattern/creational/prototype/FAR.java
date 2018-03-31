package com.ycz.designpattern.creational.prototype;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FAR implements OfficialDocument {

    private static final Logger logger = LoggerFactory.getLogger(FAR.class);

    public OfficialDocument clone() {
        OfficialDocument o = null;
        try {
            o = (OfficialDocument) super.clone();
            return o;
        } catch (CloneNotSupportedException e) {
            logger.error("FAR Cloning failure");
            e.printStackTrace();
        }
        return o;
    }

    public void display() {
        logger.info("可行性分析报告");
    }
}
