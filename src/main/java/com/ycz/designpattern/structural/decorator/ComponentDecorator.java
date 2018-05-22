package com.ycz.designpattern.structural.decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ComponentDecorator extends Component {

    private static final Logger logger = LoggerFactory.getLogger(ComponentDecorator.class);

    private Component component;

    public ComponentDecorator(Component component) {
        this.component = component;
    }

    public void display() {
        component.display();
    }
}
