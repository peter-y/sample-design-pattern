package com.ycz.designpattern.creational.simpleFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PieChartSf implements ChartSf {

    private static final Logger logger = LoggerFactory.getLogger(PieChartSf.class);

    public PieChartSf() {
        logger.debug("create PieChartSf");
    }

    public void display() {
        logger.debug("PieChartSf display");
    }
}
