package com.ycz.designpattern.behavioral.visitor.complete;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 正式员工.
 * @author geolisa
 * @version created in 2018/5/24 15:09
 */
public class FulltimeEmployee implements Employee {
    private static final Logger logger = LoggerFactory.getLogger(FulltimeEmployee.class);
    private String name;
    private double weeklyWage;
    private int workTime;

    public FulltimeEmployee(String name, double weeklyWage, int workTime) {
        this.name = name;
        this.weeklyWage = weeklyWage;
        this.workTime = workTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeeklyWage() {
        return weeklyWage;
    }

    public void setWeeklyWage(double weeklyWage) {
        this.weeklyWage = weeklyWage;
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
