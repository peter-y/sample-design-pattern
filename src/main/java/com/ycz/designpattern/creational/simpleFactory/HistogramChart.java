package com.ycz.designpattern.creational.simpleFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HistogramChart implements ChartSf {

    private static final Logger logger = LoggerFactory.getLogger(HistogramChart.class);

    public HistogramChart() {
        logger.debug("create HistogramChart");
    }

    public void display() {
        logger.debug("HistogramChart display");
    }
}
