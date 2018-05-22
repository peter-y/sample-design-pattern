package com.ycz.designpattern.structural.decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

@Test
public class DecoratorComponentTest {
private static final Logger logger = LoggerFactory.getLogger(DecoratorComponentTest.class);
    public void display() {
        Component component = new Window();
        Component scrollbar = new ScrollBarDecorator(component);
        scrollbar.display();
    }

    //这个厉害了，形成一种嵌套，完成多级的调用，以此来增加行为(装饰器)
    //透明装饰器
    public void mulitiDisplay() {
        Component component = new Window();
        Component scrollbar = new ScrollBarDecorator(component);
        //这种声明方式 只能调用抽象层行为，BlackBorderDecorator自己的行为不能被调用
        Component blackborder = new BlackBorderDecorator(scrollbar);
        blackborder.display();
    }

    public void mulitiDisplayTest() {
        Component component = new Window();
        Component scrollbar = new ScrollBarDecorator(component);
        //这种声明方式 只能调用抽象层行为，BlackBorderDecorator自己的行为不能被调用
        Component blackborder = new BlackBorderDecorator(scrollbar);
        Component blackborder1 = new BlackBorderDecorator(blackborder);
        //透明装饰能够 一直去叠加层
        blackborder1.display();
    }

    /**
     * 半透明装饰.
     */
    public void translucentDecorator() {
        Component component = new Window();
        Component scrollbar = new ScrollBarDecorator(component);
        //声明具体类型 来只调用新增行为方法
        BlackBorderDecorator black = new BlackBorderDecorator(scrollbar);
        black.display();
        black.showBlackBorder();
        BlackBorderDecorator b1 = new BlackBorderDecorator(black);
        logger.debug("----------------------------");
        b1.display();
    }
}
