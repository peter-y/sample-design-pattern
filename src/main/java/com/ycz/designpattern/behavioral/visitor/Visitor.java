package com.ycz.designpattern.behavioral.visitor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 访问者抽象.
 *
 * @author geolisa
 * @version created in 2018/5/24 14:31
 */
public abstract class Visitor {

    private static final Logger logger = LoggerFactory.getLogger(Visitor.class);

    public abstract void visit(ConcreteElementA concreteElementA);

    public abstract void visit(ConcreteElementB concreteElementB);

    public void visit(ConcreteElementC concreteElementC) {
        logger.info("visit concreteElementC");
    }
}
