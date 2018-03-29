package com.ycz.designpattern.principle.LoD;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LodButton {

    private static final Logger logger = LoggerFactory.getLogger(LodButton.class);
    private Mediator mediator;

    public LodButton(Mediator mediator) {
        this.mediator = mediator;
    }

    public void click() {
        logger.debug("click event");
        mediator.change();
    }
}
