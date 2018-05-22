package com.ycz.designpattern.creational.singleCase;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Initialization Demand Holder(静态内部类，理解上就是最终方案，各方面都能艰苦，依赖语言)<br>
 * <p style="color:#FFA500">因为没有自己实例的静态成员变量，类加载类时不会初始化<br>
 * 相当于把饿汉式的不可控初始化过程，通过内部类的方式完成可控(使用的时候通过方法获取，初始化内部类成员变量)<br>
 * 该方法也不产生锁,性能不受损<br></p>
 */
public class IoDHSingleton {

    private static final Logger logger = LoggerFactory.getLogger(IoDHSingleton.class);

    private IoDHSingleton() {
        logger.debug("IoDHSingleton init");
    }

    public static IoDHSingleton getInstance() {
        return creator.ioDHSingleton;
    }

    //静态内部类
    private static class creator {

        //getInstance时 静态的成员变量会被初始化,java虚拟机保证其线程安全，成员变量只能初始化一次(参考饿汉)
        private static final IoDHSingleton ioDHSingleton = new IoDHSingleton();
    }
}
