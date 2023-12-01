package com.springwithsqlpractice.springsqlpractice.repository;

import com.springwithsqlpractice.springsqlpractice.model.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Students,Integer> {

}
