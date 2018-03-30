package com.ycz.designpattern.creational.simpleFactory.s1;

public abstract class Product {

    private String name;
    private String color;
    private String size;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }


    public abstract void doInput();

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this)
            .add("name", name)
            .add("color", color)
            .add("size", size)
            .toString();
    }
}
