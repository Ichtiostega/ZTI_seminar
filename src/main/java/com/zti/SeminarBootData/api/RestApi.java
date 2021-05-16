package com.zti.SeminarBootData.api;

import com.zti.SeminarBootData.dao.DatabaseInterface;
import com.zti.SeminarBootData.model.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RestApi {

    @Autowired
    private DatabaseInterface databaseInterface;

    @GetMapping("/helloWorld")
    public String helloWorld(){
        return "Henlo!";
    }

    @GetMapping(value="/all")
    public @ResponseBody Iterable<Student> getAllStudents() {
        return databaseInterface.findAll();
    }

    @GetMapping(value="/bySurname/{surname}")
    public @ResponseBody Iterable<Student> getStudentsByName(@PathVariable(value="surname") String surname) {
        return databaseInterface.findBySurname(surname);
    }
    

}