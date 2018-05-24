package com.ycz.designpattern.behavioral.visitor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 元素实现类B.
 *
 * @author geolisa
 * @version created in 2018/5/24 14:36
 */
public class ConcreteElementB implements Element {

    private static final Logger logger = LoggerFactory.getLogger(ConcreteElementB.class);

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void operatedB() {
        logger.info("B 业务操作");
    }
}
