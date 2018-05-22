package com.ycz.designpattern.creational.builder;

public class AngelBuilder extends ActorBuilder {

    public void buildName() {
        actor.setName("Gabriel");
    }

    public void buildType() {
        actor.setType("angel");
    }

    public void buildSex() {
        actor.setSex("women");
    }

    public void buildFace() {
        actor.setFace("beautiful");
    }

    public void buildCostome() {
        actor.setCostume("short skirt");
    }

    public void buildHairstyle() {
        actor.setHairstyle("long hair");
    }
}
