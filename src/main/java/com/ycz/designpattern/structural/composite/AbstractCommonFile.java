package com.ycz.designpattern.structural.composite;

import org.slf4j.Logger;

public abstract class AbstractCommonFile extends AbstractFile {

    private Logger logger;

    public AbstractCommonFile(String name) {
        setName(name);
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }
    //add remove getChild 这三个方法其实对 不同文件来说是没有意义的
    //编译时期能通过，但是不确保线上时被调用之后会不会存在问题(出现错误)
    @Override
    public void add(AbstractFile file) {
        logger.debug("{} 非目录不能执行此操作", getName());
    }

    @Override
    public void remove(AbstractFile file) {
        logger.debug("{} 非目录不能执行此操作", getName());
    }

    @Override
    public AbstractFile getChild(int i) {
        logger.debug("{} 非目录不能执行此操作", getName());
        return null;
    }

}
