package com.ycz.designpattern.creational.singleCase;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TaskManager {

    private static final Logger logger = LoggerFactory.getLogger(TaskManager.class);

    //保证外部不能通过new 创建 private
    private TaskManager() {
    }

    //保存唯一的实例
    //私有 静态
    private static TaskManager tm = null;

    //让外界通过统一的方法获取实例
    public static TaskManager getInstance() {
        if (tm == null) {
            //new的过程可能会很长，多个线程进入的时候可能提一个new的taskManager还没有创建成功
            //然后就会产生多个实例
            tm = new TaskManager();
        }
        return tm;
    }

    public void displayProcesses() {
        logger.debug("displayProcesses ....");
    }

    public void displayService() {
        logger.debug("displayService ....");
    }
}
