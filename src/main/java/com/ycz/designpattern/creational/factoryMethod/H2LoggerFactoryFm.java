package com.ycz.designpattern.creational.factoryMethod;

public class H2LoggerFactoryFm extends AbstractLoggerFactoryFm {

    public LoggerFactoryFm createLoggerFactory() {
        return new H2LoggerFactoryFm();
    }

    public LoggerFm createLogger() {
        return new H2LoggerFm();
    }
}
