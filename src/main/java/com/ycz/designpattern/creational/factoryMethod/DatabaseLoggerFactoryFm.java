package com.ycz.designpattern.creational.factoryMethod;

public class DatabaseLoggerFactoryFm implements LoggerFactoryFm {

    public LoggerFm createLogger() {
        return new DatabaseLoggerFm();
    }
}
