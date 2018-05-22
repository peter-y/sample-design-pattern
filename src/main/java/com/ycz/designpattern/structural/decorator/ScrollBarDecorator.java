package com.ycz.designpattern.structural.decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ScrollBarDecorator extends ComponentDecorator {

    private static final Logger logger = LoggerFactory.getLogger(ScrollBarDecorator.class);

    public ScrollBarDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        setScrollBar();
        super.display();
    }

    public void setScrollBar() {
        logger.debug("add scroll bar");
    }
}
