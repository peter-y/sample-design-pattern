package com.ycz.designpattern.behavioral.visitor.complete;

/**
 * 抽象访问者(部门).
 *
 * @author geolisa
 * @version created in 2018/5/24 15:08
 */
public abstract class Department {

    public abstract void visit(FulltimeEmployee fulltimeEmployee);

    public abstract void visit(ParttimeEmployee parttimeEmployee);
}
