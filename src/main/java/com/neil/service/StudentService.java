package com.neil.service;

import com.neil.pojo.Students;

import java.util.List;


public interface StudentService {
    List<Students> findAll();

    List<Students> queryStudentsByName(String name);

    Students findById(int id);
}
