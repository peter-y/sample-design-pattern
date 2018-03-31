package com.ycz.designpattern.creational.prototype;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SRS implements OfficialDocument {

    private static final Logger logger = LoggerFactory.getLogger(SRS.class);

    public OfficialDocument clone() {
        OfficialDocument o = null;
        try {
            o = (OfficialDocument) super.clone();
            return o;
        } catch (CloneNotSupportedException e) {
            logger.error("SRS Cloning failure");
            e.printStackTrace();
        }
        return o;
    }

    public void display() {
        logger.info("软件需求规格说明书");
    }
}
