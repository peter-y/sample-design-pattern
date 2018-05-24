package com.ycz.designpattern.behavioral.visitor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 访问者实现类.
 * @author geolisa
 * @version created in 2018/5/24 14:34
 */
public class ConcreteVisitor extends Visitor {

    private static final Logger logger = LoggerFactory.getLogger(ConcreteVisitor.class);

    public void visit(ConcreteElementA concreteElementA) {
        logger.info("visit concreteElementA");
    }

    public void visit(ConcreteElementB concreteElementB) {
        logger.info("visit concreteElementB");
    }
}
