package com.ycz.designpattern.creational.singleCase.s1;

/**
 * 饿汉式
 */
public class PlainOldSingleton {

    private static PlainOldSingleton INSTANCE = new PlainOldSingleton();

    private PlainOldSingleton() {
        System.out.println("PlainOldSingleton");
    }

    public static PlainOldSingleton getInstance() {
        return INSTANCE;
    }
}
