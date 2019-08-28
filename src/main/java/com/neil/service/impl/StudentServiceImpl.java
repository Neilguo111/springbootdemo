package com.neil.service.impl;

import com.neil.mapper.StudentsMapper;
import com.neil.pojo.Students;
import com.neil.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

//    @Autowired
//    private StudentDao studentDao;
    //依赖注入
    @Autowired
    private StudentsMapper mapper;

    @Override
    public Students findById(int id) {
        return mapper.findById(id);
    }

    @Override
    public List<Students> findAll() {
        List<Students> list = mapper.findAll();
        return list;
    }


    @Override
    public List<Students> queryStudentsByName(String name) {
        List<Students> students = mapper.queryStudentsByName(name);
        return students;
    }


}
