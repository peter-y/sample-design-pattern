package com.ycz.designpattern.behavioral.visitor.complete;

/**
 * 抽象元素角色(员工).
 *
 * @author geolisa
 * @version created in 2018/5/24 15:07
 */
public interface Employee {

    public void accept(Department department);
}
