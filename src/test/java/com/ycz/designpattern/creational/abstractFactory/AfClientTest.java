package com.ycz.designpattern.creational.abstractFactory;

import java.net.URISyntaxException;
import java.net.URL;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

@Test
public class AfClientTest {

    private static final Logger logger = LoggerFactory.getLogger(AfClientTest.class);

    public void display() {
        //抽象工厂模式 主要是 抽象高层
        //抽象产品族 抽象产品等级结构
        SkinFactory skinFactory = new SpringSkinFactory();
        skinFactory.createButton().display();
        skinFactory.createComboBox().display();
        skinFactory.createTextField().display();
    }

    public void displayByFakeDI() throws URISyntaxException {
        URL fileURL = this.getClass().getResource("/abstractFactory/config.xml");
        SkinFactory skinFactory = (SkinFactory) XmlUtil.getBean(fileURL.getFile());
    }
}
