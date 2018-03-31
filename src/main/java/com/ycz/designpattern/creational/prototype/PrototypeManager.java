package com.ycz.designpattern.creational.prototype;

import java.util.Hashtable;

/**
 * 饿汉单例
 */
public class PrototypeManager {

    private PrototypeManager() {
        //初始化添加两个报告
        ht.put("far", new FAR());
        ht.put("srs", new SRS());
    }

    private static final PrototypeManager PROTOTYPE_MANAGER = new PrototypeManager();

    //线程安全 链表 + 数组
    private Hashtable<String, OfficialDocument> ht = new Hashtable<String, OfficialDocument>();

    public static PrototypeManager getPrototypeManager() {
        return PROTOTYPE_MANAGER;
    }

    public void addOfficialDocument(String key, OfficialDocument document) {
        ht.put(key, document);
    }

    public OfficialDocument getOfficialDocument(String key) {
        //拿到一个clone的副本
        return ht.get(key).clone();
    }

}
