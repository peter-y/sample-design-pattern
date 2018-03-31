package com.ycz.designpattern.creational.prototype;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class PrototypeManagerTest {

    private static final Logger logger = LoggerFactory.getLogger(PrototypeManagerTest.class);

    public void getOfficialDocument() {
        // 问题 每个OfficialDocument 类都需要实现clone方法
        // 如果类中嵌套层次太多，嵌套克隆处理容易出问题
        PrototypeManager p = PrototypeManager.getPrototypeManager();
        OfficialDocument o = p.getOfficialDocument("srs");
        o.display();
        o = p.getOfficialDocument("far");
        o.display();
        //设置新的对象
        OfficialDocument n = p.getOfficialDocument("srs");
        Assert.assertTrue(o != n);
    }

}
