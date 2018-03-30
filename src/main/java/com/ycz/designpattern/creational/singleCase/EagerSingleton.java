package com.ycz.designpattern.creational.singleCase;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 饿汉单例
 */
public class EagerSingleton {

    private static final Logger logger = LoggerFactory.getLogger(EagerSingleton.class);

    private EagerSingleton() {
        logger.debug("EagerSingleton init");
    }

    //类被加载时静态变量进行初始化(被谁加载的时候???)
    private static final EagerSingleton eagerSingleton = new EagerSingleton();

    public static EagerSingleton getInstance() {
        return eagerSingleton;
    }
}
