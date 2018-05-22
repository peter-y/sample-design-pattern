package com.ycz.designpattern.structural.decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BlackBorderDecorator extends ComponentDecorator {

    private static final Logger logger = LoggerFactory.getLogger(BlackBorderDecorator.class);

    public BlackBorderDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        setBlackBorder();
        super.display();
    }

    public void setBlackBorder() {
        logger.debug("add black Border");
    }

    public void showBlackBorder() {
        logger.debug("show black Border");
    }
}
