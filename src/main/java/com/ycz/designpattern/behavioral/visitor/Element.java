package com.ycz.designpattern.behavioral.visitor;

/**
 * 元素接口.
 * @author geolisa
 * @version created in 2018/5/24 14:35
 */
public interface Element {

    public void accept(Visitor visitor);
}
