package com.neil.mapper;

import com.neil.pojo.Students;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


@Mapper
public interface StudentsMapper{

    List<Students> findAll();

    Students findById(@Param("id")int id);

    List<Students> queryStudentsByName(String name);

}
