package com.ycz.designpattern.structural.composite;

public abstract class AbstractFile {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //透明模式中可以把 add remove getchild的实现放入顶级抽象类中
    public abstract void add(AbstractFile file);

    public abstract void remove(AbstractFile file);

    public abstract AbstractFile getChild(int i);

    //安全模式中 则会把add remove getchild这3个方法实现在具体的类中，
    //但是这样就区分了类别，不能抽象编程
    public abstract void killVirus();
}
