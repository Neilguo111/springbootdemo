package com.neil.controller;

import com.neil.pojo.Students;
import com.neil.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("/list")
    public List<Students> list(){
        List<Students> list = this.studentService.findAll();
        return list;
    }

    @RequestMapping("list/{name}")
    public List<Students> queryStudentsByName(@PathVariable("name")String name){
        List<Students> list = this.studentService.queryStudentsByName(name);
        return list;
    }

    @RequestMapping("/{id}")
    public Students findById( @PathVariable int id){
        Students student = this.studentService.findById(id);
        return student;
    }

}
