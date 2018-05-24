package com.ycz.designpattern.behavioral.visitor.complete;

import java.util.ArrayList;
import java.util.List;

/**
 * 对象结构(员工列表).
 *
 * @author geolisa
 * @version created in 2018/5/24 15:08
 */
public class EmployeeList {

    private List<Employee> employees = new ArrayList<Employee>();

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    /**
     * 遍历访问员工列表中的每一个对象.
     */
    public void accept(Department department) {
        for (Employee e : employees) {
            e.accept(department);
        }
    }
}
