package com.ycz.designpattern.principle.OCP;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

@Test
public class ChatTest {

    private static final Logger logger = LoggerFactory.getLogger(ChatTest.class);

    public void doDisplay() {
        logger.debug("test display");
        //显示被抽象 这种思路有点儿像英语语法 说话 + 谁
        //为了产生不修改代码而产生的多态行为，只需要 调换 这个谁就可能产生不同的结果
        ChartDisplay chatDisplay = new ChartDisplay(new BarChart());
        chatDisplay.display();
    }
}
