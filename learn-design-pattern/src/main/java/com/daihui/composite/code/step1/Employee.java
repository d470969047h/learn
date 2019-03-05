package com.daihui.composite.code.step1;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: daihui
 * @Description: 步骤 1 创建 Employee 类，该类带有 Employee 对象的列表。
 * @Date: Created in 11:16 2019-02-22
 * @Modified By:
 */
public class Employee {

    private String name;
    private String dept;
    private int salary;
    private List<Employee> subordinates;

    public Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        subordinates = new ArrayList<Employee>();
    }

    public void add(Employee e) {
        subordinates.add(e);
    }

    public void remove(Employee e) {
        subordinates.remove(e);
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    @Override
    public String toString() {
        return ("Employee :[ Name : " + name
                + ", dept : " + dept + ", salary :"
                + salary + " ]");
    }
}
