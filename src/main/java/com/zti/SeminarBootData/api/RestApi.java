package com.zti.SeminarBootData.api;

import com.zti.SeminarBootData.dao.DatabaseInterface;
import com.zti.SeminarBootData.model.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Transactional
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

    @GetMapping(value="/startingSurname/{surname}")
    public @ResponseBody Iterable<Student> findBySurnameStartingWith(@PathVariable(value="surname") String surname)
    {
        return databaseInterface.findBySurnameStartingWith(surname);
    }

    @GetMapping(value="/endingWith/{name}/{id}")
    public @ResponseBody Iterable<Student> findByNameEndingWith(@PathVariable String name, @PathVariable int id)
    {
        return databaseInterface.findByNameEndingWithIgnoreCaseAndIdGreaterThanEqualOrderBySurnameDesc(name, id);
    }

    @GetMapping(value="/nieNull")
    public @ResponseBody Iterable<Student> nieNull()
    {
        return databaseInterface.nieNull();
    }

    @DeleteMapping(value="/bySur/{surname}")
    public void deleteBySurname(@PathVariable String surname){
        databaseInterface.deleteBySurname(surname);
    }

    @PostMapping(value="/print")
    public void postEntity(@RequestBody Student student)
    {
        System.out.println(student.getName() + student.getSurname());
    }

}