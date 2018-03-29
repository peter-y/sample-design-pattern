package com.ycz.designpattern.principle.LoD;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Mediator {

    private static final Logger logger = LoggerFactory.getLogger(Mediator.class);

    private LodList lodList;

    public LodList getLodList() {
        return lodList;
    }

    public void setLodList(LodList lodList) {
        this.lodList = lodList;
    }

    public void change() {
        logger.debug("change event");
        changeTo();
    }

    private void changeTo() {
        changeLodList();
    }

    private void changeLodList() {
        lodList.setName("new name by button change");
    }
}
