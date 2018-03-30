package com.ycz.designpattern.creational.abstractFactory;

public class SummerSkinFactory implements SkinFactory {

    public ButtonAf createButton() {
        return new SummerButtonAf();
    }

    public TextFieldAf createTextField() {
        return new SummerTextFieldAf();
    }

    public ComboBoxAf createComboBox() {
        return new SummerComboBoxAf();
    }
}
