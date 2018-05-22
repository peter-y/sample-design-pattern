package com.ycz.designpattern.creational.builder;

public class ActorController {

    public static Actor construct(ActorBuilder actorBuilder) {
        actorBuilder.buildName();
        actorBuilder.buildType();
        actorBuilder.buildSex();
        actorBuilder.buildFace();
        actorBuilder.buildCostome();
        actorBuilder.buildHairstyle();
        return actorBuilder.createActor();
    }
}
