package com.zti.SeminarBootData.dao;

import com.zti.SeminarBootData.model.Student;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DatabaseInterface extends CrudRepository<Student, Integer> {
    Iterable<Student> findBySurname(String surname);
}