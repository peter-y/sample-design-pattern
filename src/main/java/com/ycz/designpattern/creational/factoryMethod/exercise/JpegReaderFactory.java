package com.ycz.designpattern.creational.factoryMethod.exercise;

public class JpegReaderFactory extends ImageReaderFactory {

    public ImageReader getReader() {
        return new JpegReader();
    }
}
