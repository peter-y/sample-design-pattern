package com.ycz.designpattern.principle.CRP;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OracleDBUtil extends DBUtil {

    private static final Logger logger = LoggerFactory.getLogger(OracleDBUtil.class);

    public void getConnection() {
        logger.debug("OracleDBUtil getConnection");
    }
}
