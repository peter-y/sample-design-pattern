package com.ycz.designpattern.creational.builder;

public class HeroBuilder extends ActorBuilder {

    public void buildName() {
        actor.setName("Iron Man");
    }

    public void buildType() {
        actor.setType("hero");
    }

    public void buildSex() {
        actor.setSex("male");
    }

    public void buildFace() {
        actor.setFace("handsome");
    }

    public void buildCostome() {
        actor.setCostume("iron armor");
    }

    public void buildHairstyle() {
        actor.setHairstyle("short hair");
    }
}
