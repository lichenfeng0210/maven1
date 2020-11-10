package com.lcf.entity;

import java.io.Serializable;

/**
 * @author BigData - lcf
 * @create 2020-11-10 10:18
 */
public class Student implements Serializable {
    private Integer id;
    private String name;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(Integer id) {
        this.id = id;
    }

    public Student() {
        super();
    }
}
