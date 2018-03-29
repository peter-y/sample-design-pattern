package com.ycz.designpattern.principle.CRP;

public class CrpCustomerDao {

    DBUtil dbUtil;

    public DBUtil getDbUtil() {
        return dbUtil;
    }

    public void setDbUtil(DBUtil dbUtil) {
        this.dbUtil = dbUtil;
    }

    public void addCustomer() {
        dbUtil.getConnection();
    }
}
