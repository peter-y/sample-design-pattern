package com.ycz.designpattern.creational.prototype;

import java.io.IOException;
import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class DepthCloneWeeklylogTest {

    private static final Logger logger = LoggerFactory.getLogger(DepthCloneWeeklylogTest.class);

    public void depthClone() {
        DepthCloneWeeklylog weeklylog = new DepthCloneWeeklylog();
        weeklylog.setDate(new Date().toString());
        weeklylog.setName("mr.join");
        weeklylog.setContent("hot day");
        weeklylog.setTitle("work details");
        DepthCloneAttachment attachment = new DepthCloneAttachment();
        attachment.setName("attachment1");
        weeklylog.setAttachment(attachment);
        DepthCloneWeeklylog newweek = null;
        try {
            //深克隆 利用序列化来操作，完整的复制对象状态，然后还原成一个新的对象，这时候所有的内容都是新的，两个对象完全独立
            newweek = weeklylog.deepClone();
            newweek.setName("mrs.liu");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        logger.debug("是否一致 {}", weeklylog == newweek);
        logger.debug("week info {}", weeklylog.toString());
        logger.debug("week info {}", newweek != null ? newweek.toString() : null);
        Assert.assertEquals(weeklylog.getTitle(), newweek.getTitle());
        Assert.assertEquals(weeklylog.getContent(), newweek.getContent());
        Assert.assertNotEquals(weeklylog.getName(), newweek.getName());
        Assert.assertFalse(weeklylog == newweek);
        Assert.assertFalse(weeklylog.getAttachment() == newweek.getAttachment());
        //因为是浅克隆 值都是发生变化
        attachment.setName("new attachment");
        Assert.assertEquals(weeklylog.getAttachment().getName(), "new attachment");
        Assert.assertNotEquals(newweek.getAttachment().getName(), "new attachment");
    }
}
