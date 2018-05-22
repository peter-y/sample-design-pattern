package com.ycz.designpattern.creational.builder;

public class DevilBuilder extends ActorBuilder {

    public void buildName() {
        actor.setName("Mephisto");
    }

    public void buildType() {
        actor.setType("devil");
    }

    public void buildSex() {
        actor.setSex("male");
    }

    public void buildFace() {
        actor.setFace("cold");
    }

    public void buildCostome() {
        actor.setCostume("black armor");
    }

    public void buildHairstyle() {
        actor.setHairstyle("long black hair");
    }
}
