package com.ycz.designpattern.structural.bridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

@Test
public class BridgeImageTest {

    private static final Logger logger = LoggerFactory.getLogger(BridgeImageTest.class);

    public void parseFile() {
        //Image ImageImp是两个同级的抽象维度
        Image image = new JPGImage();
        ImageImp imageImp = new LinuxImageImpl();
        //通过setImageImp进行对象关联，抽象层的关联 理解上还是比较抽象，没有严格意义上的边界。
        image.setImageImp(imageImp);
        image.parseFile("JOJO");
    }

}
