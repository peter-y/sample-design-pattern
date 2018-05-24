package com.ycz.designpattern.behavioral.visitor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 元素实现类A.
 *
 * @author geolisa
 * @version created in 2018/5/24 14:35
 */
public class ConcreteElementA implements Element {

    private static final Logger logger = LoggerFactory.getLogger(ConcreteElementA.class);

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void operatedA() {
        logger.info("A 业务操作");
    }
}
