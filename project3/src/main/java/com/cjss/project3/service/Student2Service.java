package com.cjss.project3.service;

import com.cjss.project3.data.Student2;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class Student2Service {

    List<Student2> student2List = new ArrayList<>();

    //ADDING DETAILS INTO STUDENT-2


    public List<Student2> addStudents(Student2 student2) {
        student2List.add(student2);
        return student2List;
    }

    //   GETTING  DETAILS


    public List<Student2> getStudent2List() {
        return student2List;

    }


    //Deleting details................................

    public List<Student2> delete(String rollNo) {

        Optional<Student2> student2Optional = student2List.stream()
                .filter(student2 -> (student2.getRollNo()).equalsIgnoreCase(rollNo)).findFirst();
        if(student2Optional.isPresent()){
            System.out.println(student2List.remove(student2Optional.get()));
        }

        //student2List.remove(student2Optional.get());


/*

        Optional<Student2> student2Optional = student2List.stream()
                .filter(student2 -> rollNo.equalsIgnoreCase(student2.getRollNo())).forEach(s2 ->student2List.remove(student2Optional.get()) );

        student2List.stream().filter(student2 -> (student2.getRollNo().equals(rollNo)));


*/
        //(student2List)->rollNo.equals(student2.getR)
        return student2List;

    }


}
