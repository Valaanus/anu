package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Emp;
@Repository
public interface EmpRepository extends MongoRepository<Emp, Integer> {

}
