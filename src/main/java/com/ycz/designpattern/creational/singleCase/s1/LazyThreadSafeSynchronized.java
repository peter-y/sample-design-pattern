package com.ycz.designpattern.creational.singleCase.s1;

/**
 * 懒汉 线程安全
 */
public class LazyThreadSafeSynchronized {

    private static LazyThreadSafeSynchronized INSTANCE;

    private LazyThreadSafeSynchronized() {
    }

    public static synchronized LazyThreadSafeSynchronized getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new LazyThreadSafeSynchronized();
        }
        return INSTANCE;
    }

}
