package com.ycz.designpattern.principle.LoD;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LodList {

    private static final Logger logger = LoggerFactory.getLogger(LodList.class);
    private String name;

    public LodList(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        logger.debug("name is changed");
        this.name = name;
    }
}
