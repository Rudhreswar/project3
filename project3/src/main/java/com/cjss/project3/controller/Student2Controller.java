package com.cjss.project3.controller;


import com.cjss.project3.data.Student2;
import com.cjss.project3.service.Student2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Student2Controller {
    @Autowired
    private Student2Service student2Services;


    @PostMapping("/addStudent")
    public List<Student2> addStudent2(@RequestBody Student2 student2) {


        return student2Services.addStudents(student2);

    }

    @GetMapping("/getStudent2")
    public List<Student2> getStudent2() {

        return student2Services.getStudent2List();
    }

    @DeleteMapping("/delete/{rollNo}")

    public List<Student2> delete(@PathVariable String rollNo) {


        return student2Services.delete(rollNo);
    }
}
