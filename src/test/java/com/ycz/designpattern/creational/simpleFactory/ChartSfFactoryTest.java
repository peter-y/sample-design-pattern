package com.ycz.designpattern.creational.simpleFactory;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class ChartSfFactoryTest {

    //工厂方法 用于解耦 对象的创建
    public void doDisplay() {
        //简单工厂方法的简化就是 把 factory的功能融入到 chartSf中
        ChartSf c = ChartSfFactory.getChart("pie");
        c.display();
    }

    public void doDisplayException() {
        Exception ec = null;
        try {
            ChartSfFactory.getChart("test");
        } catch (Exception e) {
            e.printStackTrace();
            ec = e;
        }
        Assert.assertTrue(ec.getClass().isAssignableFrom(UnsupportedOperationException.class));
    }
}
