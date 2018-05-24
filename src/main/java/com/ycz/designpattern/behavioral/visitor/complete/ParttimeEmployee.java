package com.ycz.designpattern.behavioral.visitor.complete;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 临时员工.
 * @author geolisa
 * @version created in 2018/5/24 15:12
 */
public class ParttimeEmployee implements Employee {
    private static final Logger logger = LoggerFactory.getLogger(ParttimeEmployee.class);
    private String name;
    private double hourWage;
    private int workTime;

    public ParttimeEmployee(String name, double hourWage, int workTime) {
        this.name = name;
        this.hourWage = hourWage;
        this.workTime = workTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHourWage() {
        return hourWage;
    }

    public void setHourWage(double hourWage) {
        this.hourWage = hourWage;
    }

    public int getWorkTime() {
        return workTime;
    }

    public void setWorkTime(int workTime) {
        this.workTime = workTime;
    }

    public void accept(Department department) {
        department.visit(this);
    }
}
