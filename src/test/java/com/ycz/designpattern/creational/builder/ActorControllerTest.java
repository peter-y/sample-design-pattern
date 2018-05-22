package com.ycz.designpattern.creational.builder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

@Test
public class ActorControllerTest {

    private static final Logger logger = LoggerFactory.getLogger(ActorControllerTest.class);

    public void controllerConstruct() {
        Actor actor = ActorController.construct(new AngelBuilder());
        logger.debug(actor.toString());
    }

    public void builderConstruct() {
        logger.debug(new DevilBuilder().construct().toString());
    }
}
