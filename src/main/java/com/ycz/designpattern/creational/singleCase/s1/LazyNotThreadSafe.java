package com.ycz.designpattern.creational.singleCase.s1;

/**
 * 懒汉
 */
public class LazyNotThreadSafe {

    private static LazyNotThreadSafe INSTANCE;

    private LazyNotThreadSafe() {
    }

    public static LazyNotThreadSafe getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new LazyNotThreadSafe();
        }
        return INSTANCE;
    }
}
