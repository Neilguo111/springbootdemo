package com.neil.dao;

import com.neil.pojo.Students;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDao extends JpaRepository<Students,Integer> {

}
