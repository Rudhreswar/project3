package com.cjss.project3.data;

import java.util.List;

public class Student2 {


    private String rollNo;
    private String name;
    private List<Marks> marksList;

    public List<Marks> getMarksList() {
        return marksList;
    }

    public void setMarksList(List<Marks> marksList) {

        this.marksList = marksList;
    }


    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
