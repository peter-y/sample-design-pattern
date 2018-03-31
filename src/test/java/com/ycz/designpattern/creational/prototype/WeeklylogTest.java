package com.ycz.designpattern.creational.prototype;

import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class WeeklylogTest {

    private static final Logger logger = LoggerFactory.getLogger(WeeklylogTest.class);

    public void cloneWeeklylog() {
        Weeklylog weeklylog = new Weeklylog();
        weeklylog.setDate(new Date().toString());
        weeklylog.setName("mr.join");
        weeklylog.setContent("hot day");
        weeklylog.setTitle("work details");
        Attachment attachment = new Attachment();
        attachment.setName("attachment1");
        weeklylog.setAttachment(attachment);
        Weeklylog newweek = null;
        try {
            //如果对象需要支持clone方法，则需要实现 java.lang.Cloneable 接口
            //clone操作是浅克隆，只复制值类型的数据，引用类型的数据直接被重新指向(也就是两个数据引用地址相同)
            newweek = weeklylog.clone();
            newweek.setName("mrs.liu");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        logger.debug("是否一致 {}", weeklylog == newweek);
        logger.debug("week info {}", weeklylog.toString());
        logger.debug("week info {}", newweek != null ? newweek.toString() : null);
        Assert.assertEquals(weeklylog.getTitle(), newweek.getTitle());
        Assert.assertEquals(weeklylog.getContent(), newweek.getContent());
        Assert.assertNotEquals(weeklylog.getName(), newweek.getName());
        Assert.assertFalse(weeklylog == newweek);
        Assert.assertTrue(weeklylog.getAttachment() == newweek.getAttachment());
        //因为是浅克隆 值都是发生变化
        attachment.setName("new attachment");
        Assert.assertEquals(weeklylog.getAttachment().getName(), "new attachment");
        Assert.assertEquals(newweek.getAttachment().getName(), "new attachment");
    }

}
