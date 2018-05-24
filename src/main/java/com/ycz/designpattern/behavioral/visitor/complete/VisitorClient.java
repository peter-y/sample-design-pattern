package com.ycz.designpattern.behavioral.visitor.complete;

/**
 * 客户端类.
 *
 * @author geolisa
 * @version created in 2018/5/24 15:33
 */
public class VisitorClient {

    public static void main(String[] args) {
        Employee fte1 = new FulltimeEmployee("张无忌", 3200.00, 45);
        Employee fte2 = new FulltimeEmployee("杨过", 2000.00, 40);
        Employee fte3 = new FulltimeEmployee("段誉", 2400.00, 38);
        Employee pte1 = new ParttimeEmployee("洪七公", 80.00, 20);
        Employee pte2 = new ParttimeEmployee("郭靖", 60.00, 18);
        EmployeeList list = new EmployeeList();
        list.addEmployee(fte1);
        list.addEmployee(fte2);
        list.addEmployee(fte3);
        list.addEmployee(pte1);
        list.addEmployee(pte2);
        Department dep = new FaDepartment();
        list.accept(dep);
        dep = new HrDepartment();
        list.accept(dep);
    }
}
