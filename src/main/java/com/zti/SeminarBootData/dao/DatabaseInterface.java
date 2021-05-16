package com.zti.SeminarBootData.dao;

import com.zti.SeminarBootData.model.Student;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DatabaseInterface extends MongoRepository<Student, Integer> {
    Iterable<Student> findBySurname(String surname);
}