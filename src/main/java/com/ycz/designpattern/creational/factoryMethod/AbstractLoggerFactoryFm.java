package com.ycz.designpattern.creational.factoryMethod;

public abstract class AbstractLoggerFactoryFm implements LoggerFactoryFm {

    public void writeLog(String writeContent) {
        LoggerFm loggerFm = createLoggerFactory().createLogger();
        loggerFm.writeLog(writeContent);
    }

    public abstract LoggerFactoryFm createLoggerFactory();

}
