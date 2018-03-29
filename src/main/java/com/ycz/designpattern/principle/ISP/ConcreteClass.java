package com.ycz.designpattern.principle.ISP;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConcreteClass implements DataHandler, ChartHandler {

    private static final Logger logger = LoggerFactory.getLogger(ConcreteClass.class);

    public void createChart() {
        logger.debug("ConcreteClass createChart");
    }

    public void displayChart() {
        logger.debug("ConcreteClass displayChart");
    }

    public void dataRead() {
        logger.debug("ConcreteClass dataRead");
    }
}
