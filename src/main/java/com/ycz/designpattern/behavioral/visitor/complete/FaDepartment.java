package com.ycz.designpattern.behavioral.visitor.complete;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 财务部(访问者).
 *
 * @author geolisa
 * @version created in 2018/5/24 15:20
 */
public class FaDepartment extends Department {

    private static final Logger logger = LoggerFactory.getLogger(FaDepartment.class);

    /**
     * 计算正式员工工资.
     */
    public void visit(FulltimeEmployee fulltimeEmployee) {
        int workTime = fulltimeEmployee.getWorkTime();
        double weekWage = fulltimeEmployee.getWeeklyWage();
        if (workTime > 40) {
            weekWage = weekWage + (workTime - 40) * 100;
        } else if (workTime < 40) {
            weekWage = weekWage - (40 - workTime) * 80;
            if (weekWage < 0) {
                weekWage = 0;
            }
        }
        logger.info("正式员工" + fulltimeEmployee.getName() + "实际工资为：" + weekWage + "元。");
    }

    /**
     * 计算临时员工工资.
     */
    public void visit(ParttimeEmployee parttimeEmployee) {
        int workTime = parttimeEmployee.getWorkTime();
        double hourWage = parttimeEmployee.getHourWage();
        logger.info("临时工" + parttimeEmployee.getName() + "实际工资为：" + workTime * hourWage + "元。");

    }
}
