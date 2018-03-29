package com.ycz.designpattern.principle.ISP;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReportClass implements ReportHandler {

    private static final Logger logger = LoggerFactory.getLogger(ReportClass.class);

    public void createReport() {
        logger.debug("ReportClass createReport");
    }

    public void displayReport() {
        logger.debug("ReportClass displayReport");
    }
}
