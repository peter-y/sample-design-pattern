package com.ycz.designpattern.creational.factoryMethod.exercise;

public class GifReaderFactory extends ImageReaderFactory {

    public ImageReader getReader() {
        return new GifReader();
    }
}
