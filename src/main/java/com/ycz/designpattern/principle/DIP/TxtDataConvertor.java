package com.ycz.designpattern.principle.DIP;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TxtDataConvertor extends AbstractDataConvertor {

    private static final Logger logger = LoggerFactory.getLogger(TxtDataConvertor.class);

    public void readFile() {
        logger.debug("TxtDataConvertor readFile");
    }
}
