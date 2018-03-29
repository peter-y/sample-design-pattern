package com.ycz.designpattern.principle.OCP;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BarChart extends AbstractChart {

    private static final Logger logger = LoggerFactory.getLogger(BarChart.class);

    public void display() {
        logger.debug(this.getClass().getName() + " to display");
    }
}
