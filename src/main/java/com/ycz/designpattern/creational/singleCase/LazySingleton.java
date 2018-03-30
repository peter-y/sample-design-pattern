package com.ycz.designpattern.creational.singleCase;

/**
 * 懒汉 + 锁.双重检查
 */
public class LazySingleton {

    private LazySingleton() {

    }

    // 使用双重检查锁 + 懒汉 需要声明 volatile(可见性) lazySingleton的创建会立刻被其他线程感知
    // volatile会屏蔽jvm的代码优化，可能会降低性能
    private static volatile LazySingleton lazySingleton = null;

    /**
     * 同步方法，竞争获取实例.
     */
    public static LazySingleton getInstance() {
        //当实例的初始化长且重时，会增加线程竞争的几率，所以进行双检查，慢工细活
        //检查1
        if (lazySingleton == null) {
            //锁
            synchronized (LazySingleton.class) {
                //检查2
                if (lazySingleton == null) {
                    lazySingleton = new LazySingleton();
                }
            }
        }
        return lazySingleton;
    }
}
