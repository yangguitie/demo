package com.example.demo.springbootlession.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author ygt
 * @create 2022-07-01-16:51
 */
public class Programmer implements Serializable {
    private static final long serialVersionUID=446546546546546l;
    private String name;
    private int age;
    private float salary;
    private Date birthday;

    public Programmer() {
    }

    public Programmer(String name, int age, float salary, Date birthday) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.birthday = birthday;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", birthday=" + birthday +
                '}';
    }
}
