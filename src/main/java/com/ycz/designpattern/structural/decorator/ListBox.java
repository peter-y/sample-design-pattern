package com.ycz.designpattern.structural.decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ListBox extends Component {

    private static final Logger logger = LoggerFactory.getLogger(ListBox.class);

    public void display() {
        logger.debug("display listBox");
    }
}
