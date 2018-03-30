package com.ycz.designpattern.creational.factoryMethod;

public class FileLoggerFactoryFm implements LoggerFactoryFm {

    public LoggerFm createLogger() {
        return new FileLoggerFm();
    }
}
