package com.ycz.designpattern.principle.DIP;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExcelDataConvertory extends AbstractDataConvertor {

    private static final Logger logger = LoggerFactory.getLogger(ExcelDataConvertory.class);

    public void readFile() {
        logger.debug("ExcelDataConvertory readFile");
    }
}
