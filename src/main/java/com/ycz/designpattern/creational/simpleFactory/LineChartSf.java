package com.ycz.designpattern.creational.simpleFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LineChartSf implements ChartSf {

    private static final Logger logger = LoggerFactory.getLogger(LineChartSf.class);

    public LineChartSf() {
        logger.debug("create LineChartSf");
    }

    public void display() {
        logger.debug("LineChartSf display");
    }
}
