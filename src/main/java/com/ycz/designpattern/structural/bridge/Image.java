package com.ycz.designpattern.structural.bridge;

public abstract class Image {

    protected ImageImp imageImp;

    public void setImageImp(ImageImp iip) {
        imageImp = iip;
    }

    public abstract void parseFile(String filename);
}
