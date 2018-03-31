package com.ycz.designpattern.creational.prototype;

public interface OfficialDocument extends Cloneable {

    public OfficialDocument clone();

    public void display();
}
