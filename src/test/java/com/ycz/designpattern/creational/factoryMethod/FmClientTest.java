package com.ycz.designpattern.creational.factoryMethod;

import org.testng.annotations.Test;

@Test
public class FmClientTest {

    public void writeLog() {
        LoggerFm loggerFm = LoggerFactoryFmUtil.getLogger(new FileLoggerFactoryFm());
        loggerFm.writeLog("this is get logger to write something");
    }

    public void factoryWrite() {
        new H2LoggerFactoryFm().writeLog("h2 logger to write");
    }
}
