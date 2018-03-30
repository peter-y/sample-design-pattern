package com.ycz.designpattern.creational.simpleFactory;

import com.google.common.base.Strings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChartSfFactory {

    private static final Logger logger = LoggerFactory.getLogger(ChartSfFactory.class);

    public static ChartSf getChart(String chartName) {
        if (Strings.isNullOrEmpty(chartName)) {
            logger.debug("Invalid parameter...");
            return null;
        }
        if (chartName.equalsIgnoreCase("pie")) {
            logger.debug("factory pie");
            return new PieChartSf();
        }

        if (chartName.equalsIgnoreCase("line")) {
            logger.debug("factory line");
            return new LineChartSf();
        }

        if (chartName.equalsIgnoreCase("histogram")) {
            logger.debug("factory histogram");
            return new HistogramChart();
        }
        throw new UnsupportedOperationException("Unsupported parameter types : " + chartName);
    }
}
