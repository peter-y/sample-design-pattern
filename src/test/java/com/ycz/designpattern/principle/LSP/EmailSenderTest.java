package com.ycz.designpattern.principle.LSP;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

@Test
public class EmailSenderTest {

    private static final Logger logger = LoggerFactory.getLogger(EmailSenderTest.class);

    public void doSendEmail() {
        EmailSender emailSender = new EmailSender();
        //抽象出的Customer 包含了所有可能出现的行为，所有的子类在继承之后也拥有同样的行为
        //而可能产生改变的是进入的数据和 每个子类对不同行为的特殊定义
        emailSender.sendEmail(new CommonCustomer("张雪穗", "zhangxues@dingding.com"));
        emailSender.sendEmail(new VIPCustomer("金正", "jz_vip@dingding.vip.com"));
    }
}
