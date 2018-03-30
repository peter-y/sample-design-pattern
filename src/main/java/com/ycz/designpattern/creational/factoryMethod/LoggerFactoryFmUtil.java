package com.ycz.designpattern.creational.factoryMethod;

public class LoggerFactoryFmUtil {

    public static LoggerFm getLogger(LoggerFactoryFm loggerFactoryFm) {
        return loggerFactoryFm.createLogger();
    }
}
