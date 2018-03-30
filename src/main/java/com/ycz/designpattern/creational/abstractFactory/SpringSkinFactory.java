package com.ycz.designpattern.creational.abstractFactory;

/**
 * 抽象工厂具体某种 工厂实现
 */
public class SpringSkinFactory implements SkinFactory {

    public ButtonAf createButton() {
        return new SpringButtonAf();
    }

    public TextFieldAf createTextField() {
        return new SpringTextFieldAf();
    }

    public ComboBoxAf createComboBox() {
        return new SpringComboBoxAf();
    }
}
