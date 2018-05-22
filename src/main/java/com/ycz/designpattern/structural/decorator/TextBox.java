package com.ycz.designpattern.structural.decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TextBox extends Component {

    private static final Logger logger = LoggerFactory.getLogger(TextBox.class);

    public void display() {
        logger.debug("display textBox");
    }
}
