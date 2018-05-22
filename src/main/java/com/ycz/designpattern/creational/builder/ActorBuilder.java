package com.ycz.designpattern.creational.builder;

public abstract class ActorBuilder {

    protected Actor actor = new Actor();

    public abstract void buildName();

    public abstract void buildType();

    public abstract void buildSex();

    public abstract void buildFace();

    public abstract void buildCostome();

    public abstract void buildHairstyle();

    /**
     * 是否光头 (钩子)，子类可重写方法，用于变更构建行为
     */
    public boolean isBareheaded() {
        return false;
    }

    public Actor createActor() {
        return actor;
    }

    //方法声明在这里可能会造成 抽象建造者职责过重
    //如果构建过程过于复杂，独立(controller)处理 比较理想
    public Actor construct() {
        this.buildName();
        this.buildType();
        this.buildSex();
        this.buildFace();
        this.buildCostome();
        //变更处理顺序 通过某个钩子
        if (!this.isBareheaded()) {
            this.buildHairstyle();
        }
        return actor;
    }
}
