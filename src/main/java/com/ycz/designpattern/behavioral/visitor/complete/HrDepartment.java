package com.ycz.designpattern.behavioral.visitor.complete;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 人力资源部(访问者具体实现).
 *
 * @author geolisa
 * @version created in 2018/5/24 15:24
 */
public class HrDepartment extends Department {

    private static final Logger logger = LoggerFactory.getLogger(HrDepartment.class);

    /**
     * 正式员工工作时长.
     */
    public void visit(FulltimeEmployee fulltimeEmployee) {
        int workTime = fulltimeEmployee.getWorkTime();
        logger.info("正式员工" + fulltimeEmployee.getName() + "实际工作时间为：" + workTime
            + "小时。");
        if (workTime > 40) {
            logger.info("正式员工" + fulltimeEmployee.getName() + "加班时间为：" + (workTime - 40) + "小时。");
        } else if (workTime < 40) {
            logger.info("正式员工" + fulltimeEmployee.getName() + "请假时间为：" + (40 - workTime) + "小时。");
        }

    }

    /**
     * 临时员工工作时长.
     */
    public void visit(ParttimeEmployee parttimeEmployee) {
        int workTime = parttimeEmployee.getWorkTime();
        logger.info("临时工" + parttimeEmployee.getName() + "实际工作时间为：" + workTime + "小时。");
    }
}
