package com.zti.SeminarBootData.dao;

import com.zti.SeminarBootData.model.Student;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DatabaseInterface extends CrudRepository<Student, Integer> {
    Iterable<Student> findBySurname(String surname);
    Iterable<Student> findBySurnameStartingWith(String surname);
    Iterable<Student> findByNameEndingWithIgnoreCaseAndIdGreaterThanEqualOrderBySurnameDesc(String name, int id);
    @Query(value = "select * from student s where s.name is not Null", nativeQuery=true)
    Iterable<Student> nieNull();
    void deleteBySurname(String surname);
}