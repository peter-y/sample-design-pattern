package com.ycz.designpattern.creational.abstractFactory;

/**
 * <b>抽象工厂</b><br>
 * <span color="yellow">可以很方便的增加产品族，但是添加产品(调整产品等级结构)很麻烦 不符合开闭原则，需要修改代码</span>
 */
public interface SkinFactory {

    ButtonAf createButton();

    TextFieldAf createTextField();

    ComboBoxAf createComboBox();
}
