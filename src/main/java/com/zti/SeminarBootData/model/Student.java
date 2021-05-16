package com.zti.SeminarBootData.model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document(collection = "Student")
public class Student {

    public Student(String name, String surname, Integer album_nr) {
        this.name = name;
        this.surname = surname;
        this.album_nr = album_nr;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAlbum_nr() {
        return album_nr;
    }

    public void setAlbum_nr(Integer album_nr) {
        this.album_nr = album_nr;
    }

    @MongoId
    private String id;
    private String name;
    private String surname;
    private Integer album_nr;

    protected Student(){}
    
}
