package com.ycz.designpattern.principle.OCP;

public class PieChart extends AbstractChart {

    public void display() {
        System.out.println(this.getClass().getName() + " to display");
    }
}
