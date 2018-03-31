package com.ycz.designpattern.creational.singleCase.s1;

/**
 * 静态内部类
 */
public class LazyThreadSafeStaticInnerClass {

    private static class Holder {
        private static LazyThreadSafeStaticInnerClass INSTANCE = new LazyThreadSafeStaticInnerClass();
    }

    private LazyThreadSafeStaticInnerClass() {
    }

    public static LazyThreadSafeStaticInnerClass getInstance() {
        return Holder.INSTANCE;
    }

}
