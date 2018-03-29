package com.ycz.designpattern.principle.DIP;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

@Test
public class CustomerDaoTest {

    private static final Logger logger = LoggerFactory.getLogger(CustomerDaoTest.class);

    public void doAddCustomers() {
        logger.debug("begin");
        //实际使用的过程中 开闭原则、里氏代换原则、依赖倒转原则 会是一起出现的
        //开闭是目标 里氏代换是基础 依赖倒转是手段 相辅相成 目标一致
        CustomerDao customerDao = new CustomerDao();
        customerDao.addCustomers();

        customerDao.setDataConvertor(new ExcelDataConvertory());
        customerDao.addCustomers();
    }
}
