package com.ycz.designpattern.principle.DIP;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomerDao {

    private static final Logger logger = LoggerFactory.getLogger(CustomerDao.class);

    private AbstractDataConvertor dataConvertor;

    public CustomerDao() {
        if (dataConvertor == null) {
            dataConvertor = new TxtDataConvertor();
        }
    }

    public void setDataConvertor(AbstractDataConvertor dataConvertor) {
        this.dataConvertor = dataConvertor;
    }

    public void addCustomers() {
        logger.debug("add customer,reday convertor customer data");
        dataConvertor.readFile();
        logger.debug("data convertor end,add customer finish");
    }
}
